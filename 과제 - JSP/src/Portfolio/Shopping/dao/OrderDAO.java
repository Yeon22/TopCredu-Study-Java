package Portfolio.Shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Portfolio.Shopping.dto.CartVO;
import Portfolio.Shopping.dto.OrderVO;
import Portfolio.Shopping.utill.DBManager;

public class OrderDAO {
	private OrderDAO() {}
	
	private static OrderDAO instance = new OrderDAO();
	
	public static OrderDAO getInstance() {
		return instance;
	}
	
	//사용자가 주문
	public int insertOrder(ArrayList<CartVO> cartList, String id) {
		int maxOseq = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			String selectmaxOseq = "select max(oseq) from pofol_orders";
			pstmt = conn.prepareStatement(selectmaxOseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				maxOseq = rs.getInt(1);
			}
			pstmt.close();
			
			String insertOrder = "insert into pofol_orders(oseq, id) values(orders_seq.nextval, ?)";
			pstmt = conn.prepareStatement(insertOrder);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			for(CartVO cartVO : cartList) {
				insertOrderDetail(cartVO, maxOseq);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return maxOseq;
	}
	
	public void insertOrderDetail(CartVO cartVO, int maxOseq) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			String insertOrderDetail = "insert into pofol_order_detail(odseq, oseq, pseq, quantity) "
					+ "values(pofol_order_detail_seq.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(insertOrderDetail);
			pstmt.setInt(1, maxOseq);
			pstmt.setInt(2, cartVO.getPseq());
			pstmt.setInt(3, cartVO.getQuantity());
			pstmt.executeUpdate();
			pstmt.close();
			
			String updateCartResult = "update pofol_cart set result=2 where cseq=?";
			pstmt = conn.prepareStatement(updateCartResult);
			pstmt.setInt(1, cartVO.getCseq());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public ArrayList<OrderVO> listOrderById(String id, String result, int oseq){
		ArrayList<OrderVO> orderList = new ArrayList<OrderVO>();
		String sql = "select * from pofol_order_view where id=? and result like '%'||?||'%' and oseq=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, result);
			pstmt.setInt(3, oseq);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderVO orderVO = new OrderVO();
				orderVO.setOdseq(rs.getInt("odseq"));
				orderVO.setOseq(rs.getInt("oseq"));
				orderVO.setId(rs.getString("id"));
				orderVO.setIndate(rs.getTimestamp("indate"));
				orderVO.setMname(rs.getString("mname"));
				orderVO.setZipNum(rs.getString("zip_num"));
				orderVO.setAddress(rs.getString("address"));
				orderVO.setPhone(rs.getString("phone"));
				orderVO.setPseq(rs.getInt("pseq"));
				orderVO.setQuantity(rs.getInt("quantity"));
				orderVO.setPname(rs.getString("pname"));
				orderVO.setPrice2(rs.getInt("price2"));
				orderVO.setResult(rs.getString("result"));
				orderList.add(orderVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return orderList;
	}
	
	//현재 진행 중인 주문 내역만 조회
	public ArrayList<Integer> selectSeqorderIng(String id) {
		ArrayList<Integer> oseqList = new ArrayList<Integer>();
		String sql = "select distinct oseq from pofol_order_view where id=? and result='1' order by oseq desc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				oseqList.add(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return oseqList;
	}
	
	//관리자 모드에서 사용되는 메소드
	
	//주문리스트
	public ArrayList<OrderVO> listOrder(String member_name){
		ArrayList<OrderVO> orderList = new ArrayList<OrderVO>();
		String sql = "select * from pofol_order_view where mname like '%'||?'%' order by result, oseq desc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			if(member_name == "") {
				pstmt.setString(1, "%");
			} else {
				pstmt.setString(1, member_name);
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderVO orderVO = new OrderVO();
				orderVO.setOdseq(rs.getInt("odseq"));
				orderVO.setOseq(rs.getInt("oseq"));
				orderVO.setId(rs.getString("id"));
				orderVO.setPseq(rs.getInt("pseq"));
				orderVO.setMname(rs.getString("mname"));
				orderVO.setPname(rs.getString("pname"));
				orderVO.setQuantity(rs.getInt("quantity"));
				orderVO.setZipNum(rs.getString("zip_num"));
				orderVO.setAddress(rs.getString("address"));
				orderVO.setPhone(rs.getString("phone"));
				orderVO.setIndate(rs.getTimestamp("indate"));
				orderVO.setPrice2(rs.getInt("price2"));
				orderVO.setResult(rs.getString("result"));
				orderList.add(orderVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return orderList;
	}
	
	public void updateOrderResult(String oseq) {
		String sql = "update pofol_order_detail set result='2' where odseq=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, oseq);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
}

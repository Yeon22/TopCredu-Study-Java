package Portfolio.Shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Portfolio.Shopping.dto.ProductVO;
import Portfolio.Shopping.utill.DBManager;

public class ProductDAO {
	private ProductDAO() {}
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	//신상품 리스트 얻어오기
	public ArrayList<ProductVO> listNewProduct(){
		ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		String sql = "select * from pofol_new_pro_view";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setPseq(rs.getInt("pseq"));
				product.setName(rs.getString("name"));
				product.setPrice2(rs.getInt("price2"));
				product.setImage(rs.getString("image"));
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return productList;
	}
	
	//베스트 상품 리스트 얻어오기
	public ArrayList<ProductVO> listBestProduct(){
		ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		String sql = "select * from pofol_best_pro_view";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setPseq(rs.getInt("pseq"));
				product.setName(rs.getString("name"));
				product.setPrice2(rs.getInt("price2"));
				product.setImage(rs.getString("image"));
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return productList;
	}
	
	//상품번호로 상품 정보 한개 가져오기
	public ProductVO getProduct(String pseq) {
		ProductVO product = null;
		String sql = "select * from pofol_product where pseq=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = new ProductVO();
				product.setPseq(rs.getInt("pseq"));
				product.setName(rs.getString("name"));
				product.setKind(rs.getString("kind"));
				product.setPrice1(rs.getInt("price1"));
				product.setPrice2(rs.getInt("price2"));
				product.setPrice3(rs.getInt("price3"));
				product.setContent(rs.getString("content"));
				product.setImage(rs.getString("image"));
				product.setUseyn(rs.getString("useyn"));
				product.setBestyn(rs.getString("bestyn"));
				product.setIndate(rs.getTimestamp("indate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return product;
	}
	
	//상품종류멸 상품 리스트 얻어오기
	public ArrayList<ProductVO> listKindProduct(String kind){
		ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		String sql = "select * from pofol_product where kind=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, kind);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setPseq(rs.getInt("pseq"));
				product.setName(rs.getString("name"));
				product.setPrice2(rs.getInt("price2"));
				product.setImage(rs.getString("image"));
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return productList;
	}
	
	//여기 밑에서부턴 admin용 함수
	
	public int totalRecord(String product_name) { //총 페이지 수를 구하는 메소드
		int total_pages = 0;
		String sql = "select count(*) from pofol_product where name like '%'||?||'%'";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet pageset = null;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			if(product_name.equals("")) {
				pstmt.setString(1, "%");
			}else {
				pstmt.setString(1, product_name);
			}
			pageset = pstmt.executeQuery();
			if(pageset.next()) {
				total_pages = pageset.getInt(1);
				pageset.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}
		
		return total_pages;
	}
	
	static int view_rows = 10; //페이지의 개수
	static int counts = 10; //한페이지에 나타낼 상품의 개수
	
	//페이지 이동의 위한 메소드
	public String pageNumber(int tpage, String name) {
		String str = "";
		int total_pages = totalRecord(name);
		int page_count = total_pages / counts + 1; //페이지 카운터 계산시 = 총페이지 / 한페이지에 나타낼 상품의 개수 + 1
		
		if(total_pages % counts == 0) {
			page_count--;
		}
		if(tpage < 1) {
			tpage = 1;
		}
		
		int start_page = tpage - (tpage % view_rows) + 1;
		if(tpage % view_rows == 0) {
			start_page -= view_rows;
		}
		int end_page = start_page + (counts - 1);
		
		if(end_page > page_count) {
			end_page = page_count;
		}
		if(start_page > view_rows) {
			str += "<a href='ShoppingServlet?command=admin_product_list&tpage=1&key=" + name + "'>&lt;&lt;</a>&nbsp;&nbsp;";
			str += "<a href='ShoppingServlet?command=admimn_product_list&tpage=" + (start_page - 1);
			str += "&key=" + name + "'>&lt;</a>&nbsp;&nbsp;";
		}
		
		for(int i=start_page; i <= end_page; i++) {
			if(i == tpage) {
				str += "<font color=red>[" + i + "]&nbsp;&nbsp;</font>";
			} else {
				str += "<a href='ShoppingServlet?command=admin_product_list&tpage=" + i + 
						"&key=" + name + "'>[" + i + "]</a>&nbsp;&nbsp;";
			}
		}
		
		if(page_count > end_page) {
			str += "<a href='ShoppingServlet?command=admin_product_list&tpage=" + (end_page + 1) +
					"&key=" + name + "'> &gt; </a>&nbsp;&nbsp;";
			str += "<a href='ShoppingServlet?command=admin_product_list&tpage=" + page_count +
					"&key=" + name + "'> &gt; &gt; </a>&nbsp;&nbsp;";
		}
		
		return str;
	}
	
	//상품리스트
	public ArrayList<ProductVO> listProduct(int tpage, String product_name){
		ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		String str = "select pseq, indate, name, price1, price2, useyn, bestyn from pofol_product where name "
				+ "like '%'||?||'%' order by pseq desc";
		
		int absolutepage = 1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			absolutepage = (tpage - 1) * counts + 1;
			
			pstmt = conn.prepareStatement(str, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			if(product_name.equals("")) {
				pstmt.setString(1, "%");
			} else {
				pstmt.setString(1, product_name);
			}
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rs.absolute(absolutepage);
				int count = 0;
				
				while(count < counts) {
					ProductVO product = new ProductVO();
					product.setPseq(rs.getInt(1));
					product.setIndate(rs.getTimestamp(2));
					product.setName(rs.getString(3));
					product.setPrice1(rs.getInt(4));
					product.setPrice2(rs.getInt(5));
					product.setUseyn(rs.getString(6));
					product.setBestyn(rs.getString(7));
					productList.add(product);
					
					if(rs.isLast()) {
						break;
					}
					
					rs.next();
					count++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return productList;
	}
	
	//상품등록
	public int insertProduct(ProductVO product) {
		int result = 0;
		String sql = "insert into pofol_product (pseq, kind, name, price1, price2, price3, content, image) "
				+ "values(pofol_product_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getKind());
			pstmt.setString(2, product.getName());
			pstmt.setInt(3, product.getPrice1());
			pstmt.setInt(4, product.getPrice2());
			pstmt.setInt(5, product.getPrice3());
			pstmt.setString(6, product.getContent());
			pstmt.setString(7, product.getImage());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
	
	//상품수정
	public int updateProduct(ProductVO product) {
		int result = -1;
		String sql = "update pofol_product set kind=?, useyn=?, name=?, "
				+ "price1=?, price2=?, price3=?, content=?, image=?, bestyn=? where pseq=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getKind());
			pstmt.setString(2, product.getUseyn());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4, product.getPrice1());
			pstmt.setInt(5, product.getPrice2());
			pstmt.setInt(6, product.getPrice3());
			pstmt.setString(7, product.getContent());
			pstmt.setString(8, product.getImage());
			pstmt.setString(9, product.getBestyn());
			pstmt.setInt(10, product.getPseq());
			result = pstmt.executeUpdate();
			System.out.println("업데이트 실행 result = "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
}

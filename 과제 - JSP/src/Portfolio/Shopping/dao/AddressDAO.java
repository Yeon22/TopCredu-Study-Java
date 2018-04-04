package Portfolio.Shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Portfolio.Shopping.dto.AddressVO;
import Portfolio.Shopping.utill.DBManager;

public class AddressDAO {
	private AddressDAO() {}
	
	private static AddressDAO instance = new AddressDAO();
	
	public static AddressDAO getInstance() {
		return instance;
	}
	
	public ArrayList<AddressVO> selectAddressByRoGil(String roGil){
		ArrayList<AddressVO> list = new ArrayList<AddressVO>();
		String sql = "select * from pofol_address where ro_gil like '%'||?||'%'";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, roGil);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				AddressVO addressVO = new AddressVO();
				addressVO.setZipNum(rs.getString("zip_num"));
				addressVO.setSido(rs.getString("sido"));
				addressVO.setGugun(rs.getString("gugun"));
				addressVO.setRoGil(rs.getString("ro_gil"));
				addressVO.setZipCode(rs.getString("zip_code"));
				addressVO.setBunji(rs.getString("bunji"));
				list.add(addressVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
}

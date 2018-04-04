package Portfolio.Shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Portfolio.Shopping.utill.DBManager;

public class WorkerDAO {
	private WorkerDAO() {}
	
	private static WorkerDAO instance = new WorkerDAO();
	
	public static WorkerDAO getInstance() {
		return instance;
	}
	
	//아이디를 검색조건을 주어서 비밀번호를 얻는다.
	public int workerCheck(String userid, String userpw) {
		String sql = "select pwd from pofol_worker where id=?";
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = 0;
				String dbPwd = rs.getString(1);
				if(dbPwd.equals(userpw)) {
					result = 1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return result;
	}
}

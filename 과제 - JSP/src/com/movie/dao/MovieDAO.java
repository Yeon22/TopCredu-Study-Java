package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.MovieVO;
import com.movie.util.DBManager;

public class MovieDAO {
	private MovieDAO() {
		
	}
	
	private static MovieDAO instance = new MovieDAO();
	
	public static MovieDAO getInstance() {
		return instance;
	}
	
	public List<MovieVO> selectAllMovie(){
		String sql = "select * from movie order by code";
		List<MovieVO> list = new ArrayList<MovieVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MovieVO mVo = new MovieVO();
				mVo.setCode(rs.getInt("code"));
				mVo.setName(rs.getString("name"));
				mVo.setSupervisor(rs.getString("supervisor"));
				mVo.setActor(rs.getString("actor"));
				mVo.setPictureUrl(rs.getString("pictureUrl"));
				mVo.setDescription(rs.getString("description"));
				list.add(mVo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	public MovieVO selectMovieByCode(String code) {
		String sql = "select * from movie where code=?";
		MovieVO mVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mVo = new MovieVO();
				mVo.setCode(rs.getInt("code"));
				mVo.setName(rs.getString("name"));
				mVo.setSupervisor(rs.getString("supervisor"));
				mVo.setActor(rs.getString("actor"));
				mVo.setPictureUrl(rs.getString("pictureUrl"));
				mVo.setDescription(rs.getString("description"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return mVo;
	}
	
	public void insertMovie(MovieVO mVo) {
		String sql = "insert into movie values(movie_seq.nextval,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getName());
			pstmt.setString(2, mVo.getSupervisor());
			pstmt.setString(3, mVo.getActor());
			pstmt.setString(4, mVo.getPictureUrl());
			pstmt.setString(5, mVo.getDescription());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void updateMovie(MovieVO mVo) {
		String sql = "update movie set name=?, supervisor=?, actor=?, pictureurl=?, description=? where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getName());
			pstmt.setString(2, mVo.getSupervisor());
			pstmt.setString(3, mVo.getActor());
			pstmt.setString(4, mVo.getPictureUrl());
			pstmt.setString(5, mVo.getDescription());
			pstmt.setInt(6, mVo.getCode());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void deleteMovie(String code) {
		String sql = "delete movie where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
}

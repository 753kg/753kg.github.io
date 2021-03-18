package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

public class BoardDAO {
	// board insert
	// board select
	public List<BoardVO> selectAll() {
		List<BoardVO> boardlist = new ArrayList<>();
		
		String sql = "select * from board";
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				BoardVO board = makeBoard(rs);
				boardlist.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return boardlist;
	}
	
	public BoardVO selectById(int board_seq) {
		BoardVO board = null;
		
		String sql = "select * from board where board_seq = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, board_seq);
			rs = st.executeQuery();
			
			while(rs.next()) {
				board = makeBoard(rs);
			}
			
			updateViewCount(board_seq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return board;
	}
	
	public int insertBoard(BoardVO board) {
		
		String sql = "insert into board values(board_no_sequence.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		int result = 0;
		
		try {
			st = conn.prepareStatement(sql);
			//st.setInt(1, board.getBoard_seq());
			st.setString(1, board.getBoard_title());
			st.setString(2, board.getBoard_contents());
			st.setInt(3, board.getBoard_writer());
			st.setDate(4, board.getBoard_date());
			st.setInt(5, board.getBoard_viewcount());
			st.setString(6, board.getBoard_password());
			st.setString(7, board.getBoard_image());
			result = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		
		return result;
	}
	
	// board update
	public int updateBoard(BoardVO board) {
		
		return 0;
	}
	
	public void updateViewCount(int board_seq) {
		String sql = 
				" update board" +
				" set board_viewcount = board_viewcount + 1" +
				" where board_seq = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, board_seq);
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		
		
	}
	
	// board delete
	public int deleteBoard(int board_seq, String board_password) {
		
		String sql = 
				" delete from board" +
				" where board_seq = ? and BOARD_PASSWORD = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		int result = 0;
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, board_seq);
			st.setString(2, board_password);
			result = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		
		return result;
	}
	// board id로 select... view count 증가해야함... update set

	private BoardVO makeBoard(ResultSet rs) throws SQLException {
		BoardVO board = new BoardVO();
		board.setBoard_seq(rs.getInt("board_seq"));
		board.setBoard_title(rs.getString("board_title"));
		board.setBoard_contents(rs.getString("board_contents"));
		board.setBoard_writer(rs.getInt("board_writer"));
		board.setBoard_date(rs.getDate("board_date"));
		board.setBoard_viewcount(rs.getInt("board_viewcount"));
		board.setBoard_password(rs.getString("board_password"));
		board.setBoard_image(rs.getString("board_image"));
		return board;
	}
}

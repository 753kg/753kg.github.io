package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

public class LibraryDAO {
	
	public int signUp(MemberVO member) {
		int result = 0;
		String sql = 
				" insert into members(m_id, m_pass, m_name, birth, phone)" +
				" values(?, ?, ?, ?, ?)";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, member.getM_id());
			st.setString(2, member.getM_pass());
			st.setString(3, member.getM_name());
			st.setDate(4, member.getBirth());
			st.setString(5, member.getPhone());
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		
		return result;
	}
	
	public int quitMembers(String userID, String userPW) {
		int result = 0;
		String sql = "delete from members where m_id = ? and m_pass = ? and borr_count = 0";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, userID);
			st.setString(2, userPW);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	
	public int logIn(String userID, String userPW) {
		int result = 0;
		String sql = "select * from members where m_id = ? and m_pass = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, userID);
			st.setString(2, userPW);
			rs = st.executeQuery();
			
			if(rs.next()) result = 1;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
				
		
		return result;
	}
	
	public List<BookVO> selectAll(){
		List<BookVO> booklist = new ArrayList<>();
		
		String sql = 
				" select b_code, b_name, author, pub, pub_date," +
			    " nvl(cover, '이미지없음') cover, b_status," +
			    " decode(return_date, null, '-', return_date) return_date" +
			    " from books left outer join borrowing_view using(b_code)";
				
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				BookVO book = makeBookVO(rs);
				booklist.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return booklist;
	}
	
	public List<BookVO> selectByBookName(String bookName){
		List<BookVO> booklist = new ArrayList<>();
		
		String sql = 
				" select b_code, b_name, author, pub, pub_date," +
			    " nvl(cover, '이미지없음') cover, b_status," +
			    " decode(return_date, null, '-', return_date) return_date" +
			    " from books left outer join borrowing_view using(b_code)" +
			    " where b_name like '%'||?||'%'";
				
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, bookName);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BookVO book = makeBookVO(rs);
				booklist.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return booklist;
	}
	
	public List<BookVO> selectByAuthor(String author){
		List<BookVO> booklist = new ArrayList<>();
		
		String sql = 
				" select b_code, b_name, author, pub, pub_date," +
			    " nvl(cover, '이미지없음') cover, b_status," +
			    " decode(return_date, null, '-', return_date) return_date" +
			    " from books left outer join borrowing_view using(b_code)" +
			    " where author like '%'||?||'%'";
				
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, author);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BookVO book = makeBookVO(rs);
				booklist.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return booklist;
	}
	
	public List<BookVO> selectByCategory(String category){
		List<BookVO> booklist = new ArrayList<>();
		
		String sql = 
				" select b_code, b_name, author, pub, pub_date," +
			    " nvl(cover, '이미지없음') cover, b_status," +
			    " decode(return_date, null, '-', return_date) return_date" +
			    " from books left outer join borrowing_view using(b_code)" +
			    " where category like '%'||?||'%'";
				
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, category);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BookVO book = makeBookVO(rs);
				booklist.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		return booklist;
	}
	
	public int borrowBook(int b_code, String userID) {
		int result = 0;
		String sql = "{call borrow(?, ?, ?)}";
		
		Connection conn = DBUtil.getConnection();
		CallableStatement st = null;
		//ResultSet rs = null;
		
		try {
			st = conn.prepareCall(sql);
			st.registerOutParameter(3, java.sql.Types.INTEGER);
			st.setInt(1, b_code);
			st.setString(2, userID);
			st.executeQuery();
			
			result = st.getInt(3);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	
	public int returnBook(int b_code, String m_id) {
		int result = 0;
		String sql = "{call returnBook(?, ?, ?)}";
		
		Connection conn = DBUtil.getConnection();
		CallableStatement st = null;
		
		try {
			st = conn.prepareCall(sql);
			st.registerOutParameter(3, java.sql.Types.INTEGER);
			st.setInt(1, b_code);
			st.setString(2, m_id);
			st.executeQuery();
			
			result = st.getInt(3);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	/*
	public int returnBook(int borr_code, String m_id) {
		int result = 0;
		String sql = 
				" update borrows" +
				" set borr_status = '반납', return_date = sysdate" +
				" where borr_code = ? and m_id = ? and borr_status = '대출중'";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, borr_code);
			st.setString(2, m_id);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	*/
	// 대출내역조회
	public List<BorrowVO> selectBorrowing(String m_id){
		// 대출코드, 책 이름, 작가, 빌린날짜, 반납날짜, 대출상태
		List<BorrowVO> borrlist = new ArrayList<>();
		String sql = 
				" select borr_code, b_code, b_name, author, borr_date, return_date, borr_status" +
				" from borrowing_view join books using(b_code)" +
				" where m_id = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, m_id);
			rs = st.executeQuery();
			while(rs.next()) {
				BorrowVO borr = makeBorrVO(rs);
				borrlist.add(borr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		
		
		return borrlist;
	}
	
	public List<BorrowVO> selectBorrHistory(String m_id){
		List<BorrowVO> borrlist = new ArrayList<>();
		
		String sql = 
				" select borr_code, b_code, b_name, author, borr_date, return_date, borr_status" +
				" from borrows join books using(b_code)" +
				" where m_id = ?" +
				" order by return_date desc";
				
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, m_id);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BorrowVO borr = makeBorrVO(rs);
				borrlist.add(borr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, st, conn);
		}
		return borrlist;
	}
	
	public int extendsDate(int b_code, String m_id) {
		int result = 0;
		String sql = 
				" update borrowing_view" +
				" set return_date = return_date + 7" +
				" where b_code = ? and m_id = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, b_code);
			st.setString(2, m_id);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	
	
	
	public int updateMember(String pw, String phone, String m_id) {
		int result = 0;
		String sql = 
				" update members" +
				" set m_pass = ?, phone = ?" +
				" where m_id = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, pw);
			st.setString(2, phone);
			st.setString(3, m_id);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(null, st, conn);
		}
		return result;
	}
	
	private BorrowVO makeBorrVO(ResultSet rs) throws SQLException {
		BorrowVO borr = new BorrowVO();
		borr.setBorr_code(rs.getInt("borr_code"));
		borr.setB_code(rs.getInt("b_code"));
		borr.setB_name(rs.getString("b_name"));
		borr.setAuthor(rs.getString("author"));
		borr.setBorr_date(rs.getDate("borr_date"));
		borr.setReturn_date(rs.getDate("return_date"));
		borr.setBorr_status(rs.getString("borr_status"));
		return borr;
	}
	

	private BookVO makeBookVO(ResultSet rs) throws SQLException {
		BookVO book = new BookVO();
		book.setB_code(rs.getInt("b_code"));
		book.setB_name(rs.getString("b_name"));
		book.setAuthor(rs.getString("author"));
		book.setPub(rs.getString("pub"));
		book.setPub_date(rs.getDate("pub_date"));
		book.setCover(rs.getString("cover"));
		book.setB_status(rs.getString("b_status"));
		book.setReturn_date(rs.getString("return_date"));
		return book;
	}
}

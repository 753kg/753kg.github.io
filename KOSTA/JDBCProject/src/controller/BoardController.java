package controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.BoardDAO;
import model.BoardVO;
import view.BoardView;

public class BoardController {

	public static void main(String[] args) {
		// board select
		// selectAll();
		
		// board insert
		// insertBoard();
		
		// board update
		
		// board delete
		// deleteBoard(8, "훈이12");
		
		// board id로 select... view count 증가해야함... update set
		 selectById(6);
	}
	
	

	private static void deleteBoard(int board_seq, String board_password) {
		BoardDAO dao = new BoardDAO();
		int result = dao.deleteBoard(board_seq, board_password);
		System.out.println(result > 0 ? "삭제성공" : "삭제실패");
	}



	private static void selectById(int board_seq) {
		BoardDAO dao = new BoardDAO();
		BoardVO b = dao.selectById(board_seq);
		BoardView.print(b);
	}



	private static void selectAll() {
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardlist = dao.selectAll();
		BoardView.print(boardlist);
	}

	private static void insertBoard() {
		//int fixedVal = 0;
		BoardVO b = new BoardVO(0, "훈이예요", "안녕하세요", 104, Date.valueOf(LocalDate.now()), 0, "훈이12", "images/logo4.png");
		BoardDAO dao = new BoardDAO();
		int result = dao.insertBoard(b);
		System.out.println(result > 0 ? "입력성공" : "입력실패");
	}

}

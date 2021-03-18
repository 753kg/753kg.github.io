package view;

import java.util.List;

import model.BoardVO;

public class BoardView {
	
	public static void print(List<BoardVO> boardlist) {
		for(BoardVO b : boardlist) {
			System.out.println(b);
		}
	}
	
	public static void print(BoardVO b) {
		System.out.println("-------------------------------------------------------");
		System.out.println("제목: " + b.getBoard_title() + "\t조회수: " + b.getBoard_viewcount());
		System.out.println("게시글번호: " + b.getBoard_seq() + "\t작성자: " + b.getBoard_writer() + "\t날짜: " + b.getBoard_date());
		System.out.println("내용: " + b.getBoard_contents());
		System.out.println("이미지: " + b.getBoard_image());
	}
}

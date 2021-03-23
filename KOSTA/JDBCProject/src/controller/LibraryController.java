package controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import model.BookVO;
import model.BorrowVO;
import model.LibraryDAO;
import model.MemberVO;
import view.LibraryView;

public class LibraryController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userID = null;
		String userPW = null;
		
		while(true) {
			System.out.println("LIBRARY PROGRAM =================================");
			System.out.println("1.회원가입|2.로그인|3.도서 검색|4.대출/반납|5.마이페이지|6.종료");
			System.out.println("=================================================");
			System.out.print("작업을 선택하세요 >> ");
			int work = sc.nextInt();
			switch (work) {
			case 1:
				signIn(sc);
				break;
			case 2:
				System.out.print("ID >> ");
				userID = sc.next();
				System.out.print("PW >> ");
				userPW = sc.next();
				LibraryDAO dao = new LibraryDAO();
				int result =  dao.logIn(userID, userPW);
				if(result == 0) {
					userID = null; userPW = null;
					LibraryView.print("로그인에 실패하였습니다.");
				} else LibraryView.print("로그인 되었습니다.");
				break;
			case 3:
				searchBook(sc);
				break;
			case 4:
				if(!isLogin(userID, userPW)) break;
				System.out.println("1. 대출 | 2. 반납");
				System.out.print("선택 >> ");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					borrowBook(sc, userID);
					break;
				case 2:
					returnBook(sc, userID);
					break;
				default:
					break;
				}
				break;
			case 5:
				if(!isLogin(userID, userPW)) break;
				System.out.println("1. 개인정보수정 | 2. 대출조회/기간연장 | 3. 대출이력조회");
				System.out.print("선택 >> ");
				int num2 = sc.nextInt();
				switch (num2) {
				case 1:
					break;
				case 2:
					selectBorrowing(userID);
					break;
				case 3:
					selectBorrHistory(userID);
					break;
				default:
					break;
				}
				break;
			case 6:
				LibraryView.print("프로그램이 종료되었습니다.");
				System.exit(0);
			default:
				LibraryView.print("유효하지 않은 작업입니다.");
				break;
			}
		}
		
	}
	
	private static void selectBorrHistory(String userID) {
		LibraryDAO dao = new LibraryDAO();
		List<BorrowVO> borrlist = dao.selectBorrHistory(userID);
		LibraryView.printBorrows(borrlist);
	}

	private static void returnBook(Scanner sc, String userID) {
		selectBorrowing(userID);
		LibraryDAO dao = new LibraryDAO();
		System.out.print("반납할 책의 대출코드 입력 >> ");
		int borr_code = sc.nextInt();
		int result = dao.returnBook(borr_code, userID);
		LibraryView.print(result>0 ? "반납이 완료되었습니다." : "반납할 수 없습니다.");
	}
	
	private static void selectBorrowing(String userID) {
		LibraryDAO dao = new LibraryDAO();
		List<BorrowVO> borrlist = dao.selectBorrowing(userID);
		LibraryView.printBorrows(borrlist);
	}

	private static boolean isLogin(String user, String pass) {
		if(user == null || pass ==  null) {
			LibraryView.print("로그인이 필요한 작업입니다.");
			return false;
		}
		return true;
	}
	
	private static void borrowBook(Scanner sc, String userID) {
		System.out.println("대출할 책의 코드 입력 >> ");
		int b_code = sc.nextInt();
		LibraryDAO dao = new LibraryDAO();
		int result = dao.borrowBook(b_code, userID);
		LibraryView.print(result>0 ? "대출이 완료되었습니다." : "대출할 수 없습니다.");
	}

	private static void signIn(Scanner sc) {
		MemberVO member = new MemberVO();
		System.out.print("아이디 >> ");
		member.setM_id(sc.next());
		System.out.print("비밀번호 >> ");
		member.setM_pass(sc.next());
		System.out.print("이름 >> ");
		member.setM_name(sc.next());
		System.out.print("생년월일 [ex)2000-01-01] >> ");
		member.setBirth(Date.valueOf(sc.next()));
		System.out.print("전화번호 [ex)010-0000-0000] >> ");
		member.setPhone(sc.next());
		
		LibraryDAO dao = new LibraryDAO();
		int result =  dao.signIn(member);
		LibraryView.print(result>0 ? "회원가입 되었습니다." : "회원가입에 실패하였습니다.");
	}
	

	private static void searchBook(Scanner sc) {
		boolean run = true;
		while(run) {
			System.out.println("1.도서명으로 검색 | 2. 작가명으로 검색 | 3.전체 도서 조회 | 4. 카테고리별 조회 | 5. 뒤로가기");
			System.out.print("작업을 선택하세요 >> ");
			int num = sc.nextInt();
			aa : switch (num) {
			case 1:
				while(true) {
					System.out.print("도서명을 입력하세요 >> ");
					sc.nextLine();
					selectByBookName(sc.nextLine());
					
					System.out.println("1.다시 검색하기 | 2. 뒤로가기");
					System.out.print("선택 >> ");
					int num2 = sc.nextInt();
					if(num2 == 1) continue;
					break aa;
				}
			case 2:
				while(true) {
					System.out.print("작가명을 입력하세요 >> ");
					sc.nextLine();
					selectByAuthor(sc.nextLine());
					
					System.out.println("1.다시 검색하기 | 2. 뒤로가기");
					System.out.print("선택 >> ");
					int num2 = sc.nextInt();
					if(num2 == 1) continue;
					break aa;
				}
			case 3:
				selectAll();
				break;
	
			case 4:
				while(true) {
					System.out.println("1.소설 | 2. 에세이 | 3. 어린이");
					System.out.print("선택 >> ");
					int num3 = sc.nextInt();
					switch (num3) {
					case 1: selectByCategory("소설"); break;
					case 2: selectByCategory("에세이"); break;
					case 3: selectByCategory("어린이"); break;
					default: break;
					}
					System.out.println("1.다시 검색하기 | 2. 뒤로가기");
					System.out.print("선택 >> ");
					int num2 = sc.nextInt();
					if(num2 == 1) continue;
					break aa;
				}
				
			case 5:
				run = false;
				break;
			}
		}
	}

	private static void selectByCategory(String category) {
		LibraryDAO dao = new LibraryDAO();
		List<BookVO> booklist = dao.selectByCategory(category);
		LibraryView.printBooks(booklist);
	}


	private static void selectByAuthor(String author) {
		LibraryDAO dao = new LibraryDAO();
		List<BookVO> booklist = dao.selectByAuthor(author);
		LibraryView.printBooks(booklist);
	}

	private static void selectByBookName(String bookName) {
		LibraryDAO dao = new LibraryDAO();
		List<BookVO> booklist = dao.selectByBookName(bookName);
		LibraryView.printBooks(booklist);
	}

	private static void selectAll() {
		LibraryDAO dao = new LibraryDAO();
		List<BookVO> booklist = dao.selectAll();
		LibraryView.printBooks(booklist);
		
	}
	
}

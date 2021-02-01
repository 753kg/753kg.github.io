package openTutorials;

public class AuthApp {

	public static void main(String[] args) {
		// 생활코딩 JAVA 제어문
		
		//String[] users = {"egoing", "jinhuck", "youbin"};
		String[][] users = {
				{"egoing", "1111"}, 
				{"jinhuck", "2222"},
				{"youbin", "3333"}
		};
		
		String inputID = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputID) && current[1].equals(inputPass)) {
				isLogined = true;
				break;	// 일치하는 사용자가 있으면 종료
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}

	}

}

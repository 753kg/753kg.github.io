package javaIntermediate;

public class MusicBoxExam {

	public static void main(String[] args) {
		// 자바중급 파트7 쓰레드와 공유객체
		// 관련 파일 : MusicBox, MusicPlayer
		
		MusicBox box = new MusicBox();
		
		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer lee = new MusicPlayer(3, box);
		
		kang.start();
		kim.start();
		lee.start();

	}

}

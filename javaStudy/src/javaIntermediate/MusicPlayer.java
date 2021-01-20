package javaIntermediate;

public class MusicPlayer extends Thread {
	// 자바중급 파트7 쓰레드와 공유객체
	// 관련 파일 : MusicBox, MusicBoxExam
	
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {
		switch (type) {
		case 1:
			musicBox.playMusicA();
			break;
		case 2:
			musicBox.playMusicB();
			break;
		case 3:
			musicBox.playMusicC();
			break;
		}
	}
	
	

}

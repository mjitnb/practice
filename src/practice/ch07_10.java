package practice;


abstract class Player {				//�߻� Ŭ����
	abstract void play(int pos);	//�߻�޼���
	abstract void stop();			//�߻� �޼���
}

class AudioPlayer extends Player {
	void play(int pos) { /* ���� ���� */ }	//�߻�޼��带 ����
	void stop() { /* ���� ���� */ }			//�߻�޼��带 ����
}

abstract class AbstractPlayer extends Player {
	void play(int pos) { /* ���� ���� */ } 	//�߻�޼��带 ����
}



public class ch07_10 {

}

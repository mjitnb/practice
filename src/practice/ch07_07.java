package practice;

//�ڼ�
class Car2 {
	
	String color;
	int door;
	
	void drive() {  System.out.println("drive, Brrr~~~~");  }
	void stop() {  System.out.println("stop!!!");  }
}

//����
class FireEngine extends Car2 {
	void water()  {  System.out.println("water!!!");  }
}


//����
public class ch07_07 {
	public static void main(String[] args) {
		
		Car2 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();		// water!!!  �����۵�
		
		car = fe;		
		//car = (Car)fe; ���� ����ȯ�� ������  
		//�ڼ� -> ���� CarŸ������ ����ȯ
		//fe�� ��(��ü�ּ�)�� car�� ����
			car.color = "white";	//fe�� �ּҰ� ����� car��������(Ÿ�� Car)������ 
			car.door = 4;			//����&�޼ҵ� ȣ�� ����
			car.drive();
//			car.water();			// **������ ����!!! CarŸ���� ���������δ� water()�� ȣ���� �� ����.**
		
			
		fe2 = (FireEngine)car;		// �ڼ�Ÿ�� <- ����Ÿ��  ����ȯ ���� �Ұ�
									//����� car���� �̹� fe�� �������ִ� FireEngine ��ü �ּҰ��� ����Ǿ�����
		fe2.water();	// water!!!  �����۵�
		
	}

}

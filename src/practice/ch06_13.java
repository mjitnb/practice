package practice;


class Car {
	
	//�������
	String color;		//����
	String gearType;	//���ӱ� ����
	int door;			//���� ����
		

    //	������
	
	Car(String color, String rearType, int door) {  // ������a��� Ī�ϰ���
		this.color = color;							
		this.gearType = rearType;
		this.door = door;			// ��ü������ �÷�,���,�� 3���� �Է��Ͽ� �ʱ�ȭ�ϴ� ����
	}
	
	
	Car () {						// ������ a�� ȣ��(���)�ؼ� �� Ʋ�� �̿�. 	
		this("white", "auto", 4);	// ��ü������ 3���� �ʱ�ȭ���� �̹� ������ ����
	}
	
	Car (String color){				// ������ a�� ȣ��(���)�ؼ� �� Ʋ�� �̿�. 
		this(color, "auto", 4);  	// ��ü������ �÷��� �Է��Ͽ� �ʱ�ȭ. ���,���� �̹� ������ ����
	} 
	
	
}



public class ch06_13 {

	public static void main(String[] args) {
		
		Car c1 = new Car("blue","auto",2);		
		Car c2 = new Car();		
		Car c3 = new Car("red");		
		
		System.out.println("c1 = "+c1.color+", "+c2.gearType+", "+c1.door);
		System.out.println("c2 = "+c2.color+", "+c2.gearType+", "+c2.door);
		System.out.println("c3 = "+c3.color+", "+c3.gearType+", "+c3.door);
//		c1 = blue, auto, 2
//		c2 = white, auto, 4
//		c3 = red, auto, 4
	}

}

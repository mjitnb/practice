package practice;


class Car1 {
	String color;		//����
	String gearType;	//���ӱ� ����
	int door;			//���� ����
		
	Car1() {}
	
	Car1(String c, String d, int e) {
		this.color = c;
		this.gearType = d;
		this.door = e;
	}
}



public class ch06_12 {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();		//����. ��ü���� �� �������� ���� iv�� ������ ����&�ʱ�ȭ(iv�� ����)
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		Car1 c2 = new Car1("Black", "auto", 2); //������ ���. ������� ���Ŀ� ���� ���ϴ� �� ���Ը� �ϸ� ��
		
		System.out.println("c1�� coror = "+c1.color+", geatType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2�� coror = "+c2.color+", geatType = "+c2.gearType+", door = "+c2.door);
		
		
	}

}

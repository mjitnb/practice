package practice;


// ����
class Product1 {
	int price;		//��ǰ����
	int bonusPoint;	//����Ʈ
	
	//������
	Product1(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ����Ʈ�� ��ǰ ������ 10%
	}
}


//��ǰ Ŭ����
class Tv1 extends Product1 {
	
	// ������
	Tv1() {
		// ���� Ŭ������ �����ڸ� ȣ���Ѵ�.
		super(100);		//Tv�� ������ 100�������� �Ѵ�.
	}
	
	//ObjectŬ������ toString()�� �������̵� �Ѵ�.
	public String toString() { return "Tv";}
}

class Computer1 extends Product1 {
	public Computer1() {
		super(200);
	}
	public String toString() { return "Computer"; }
}


//��
class Buyer1 {	

	int money = 1000;		// �����ݾ�
	int bounusPoint = 0;	// ���� ����Ʈ ����
	

	//�޼����� �Ű������� �������� ���� (���� Ÿ���� ���������� �Ű������� ���)
	// �ϳ��� �޼���� ������ ó�� ����
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;		
			/*
			!!! ���Ϲ� : ����������� �޼��带 �����ϰ� ȣ���� �޼���� �ǵ��ư�.
			�̰� �Ⱦ��� �ܾ׺��� �޼��� ��� �� !!*����ؼ�*!�Ʒ� ������� ���� �� �� �� ������ ���ư�
			�ܾ��� -�߰� ������   => ���Ϲ� ��� ��!!!!!!!! 
			*/
		}
		money = money- p.price;
		bounusPoint = bounusPoint + p.bonusPoint;
		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
	}
}

public class ch07_08 {
	public static void main(String[] args) {
	
		Buyer1 b = new Buyer1();
		
//		Tv t = new Tv();	//�� ������
//		b.buy(t);			//�Ʒ��� ���� ���� �� ����
		b.buy(new Tv1());
		b.buy(new Computer1());
		
		System.out.println("> ���� ���� ���� "+ b.money+"���� �Դϴ�.");
		System.out.println("> ���� ���� ����Ʈ�� " + b.bounusPoint+"�� �Դϴ�.");
	}
}

/*
Tv��/�� �����ϼ̽��ϴ�.
Computer��/�� �����ϼ̽��ϴ�.
> ���� ���� ���� 700���� �Դϴ�.
> ���� ���� ����Ʈ�� 30�� �Դϴ�.
*/

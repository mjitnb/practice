package practice;


// ����
class Product {
	int price;		//��ǰ����
	int bonusPoint;	//����Ʈ
	
	//������
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ����Ʈ�� ��ǰ ������ 10%	
	}
	
	Product() {}	//�⺻������
}

class Tv extends Product {
	Tv() { super(100);	}
	public String toString() { return "Tv";}
}
class Computer extends Product {
	Computer() { super(200);	}
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50);	}
	public String toString() { return "Audio";}
}




//��
class Buyer {	

	int money = 1000;	
	int bounusPoint = 0;	
	Product[] cart = new Product[10];	// ������ ��ǰ�� �����ϱ����� �迭
	int i = 0;		//Product�迭�� ���� ī����

	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;		
		}
		
		money = money- p.price;
		bounusPoint = bounusPoint + p.bonusPoint;
		
		cart[i++] = p;	//��ǰ�� Product[] cart�� �����Ѵ�.
		System.out.println(p+ "��/�� �����ϼ̽��ϴ�.");
		//���ڿ��� ���������� ���������ϸ�, ���������� toString�޼��尡 ȣ��Ǿ� ���ڿ��� �� �����Ѵ�.
	}
	
	void summery () {	//������ ��ǰ������ ������ ����ؼ� �����ش�.
		int sum = 0;	//������ ��ǰ�� ���� �հ�
		String itemList = "";	// ������ ��ǰ ���
	
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
//			itemList += cart[i] + ", ";
			itemList += (i==0)? ""+cart[i] : ", "+cart[i];
			
			
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class ch07_9 {
	public static void main(String[] args) {
	
		Buyer b = new Buyer();
		

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summery();

	}
}
/*
Tv��/�� �����ϼ̽��ϴ�.
Computer��/�� �����ϼ̽��ϴ�.
Audio��/�� �����ϼ̽��ϴ�.
�����Ͻ� ��ǰ�� �� �ݾ��� 350���� �Դϴ�.
�����Ͻ� ��ǰ�� Tv, Computer, Audio�Դϴ�.
*/
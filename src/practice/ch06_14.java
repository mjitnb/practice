package practice;


public class ch06_14 {

	static {
		System.out.println("static { Ŭ���� �ʱ�ȭ �� }");
	}
	
	{
		System.out.println("{ �ν��Ͻ� �ʱ�ȭ ��  } ");
	}
	
	public ch06_14() {
		System.out.println("������");
		System.out.println();
	}
	
	//-----------------------------------------
	
	public static void main(String[] args) {
		System.out.println("ch06_14 ��ü����1");
		ch06_14 bt = new ch06_14();
		
		System.out.println("ch06_14 ��ü����2");
		ch06_14 bt2 = new ch06_14();
	}
}

//static { Ŭ���� �ʱ�ȭ �� }
//ch06_14 ��ü����1
//{ �ν��Ͻ� �ʱ�ȭ ��  } 
//������
//
//ch06_14 ��ü����2
//{ �ν��Ͻ� �ʱ�ȭ ��  } 
//������

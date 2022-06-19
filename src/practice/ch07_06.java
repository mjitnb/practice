package practice;

public class ch07_06 {
	public static void main(String[] args) {


	class Car {}

	class FireEngine extends Car {}

	class Ambulance extends Car {}

	FireEngine f = new FireEngine();

	Car c = (Car) f; // Ok. f�� ������ CarŸ������ ����ȯ
	FireEngine f2 = (FireEngine) c; // ok. c�� �ڼ��� FireEngineŸ������ ����ȯ(�����Ұ�)
//	Ambulance a = (Ambulance)f;		//����. ��Ӱ��谡 �ƴ� Ŭ�������� ����ȯ �Ұ�.

	FireEngine fe = new FireEngine();
	if (fe instanceof FireEngine) {
		System.out.println("This(fe�� �����ϴ� ��) is a FireEngine instance.");
	}
	if (fe instanceof Car) {
		System.out.println("This(fe�� �����ϴ� ��) is a Car instance.");
	}
	if (fe instanceof Object) {
		System.out.println("This(fe�� �����ϴ� ��) is a Object instance.");
	}
	
	
	}
}


//This(fe�� �����ϴ� ��) is a FireEngine instance.
//This(fe�� �����ϴ� ��) is a Car instance.
//This(fe�� �����ϴ� ��) is a Object instance.
package practice;

// �θ�Ŭ����
class Point {
	
	//�ʵ�
	protected int x;
	protected int y;
	
	//������
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//�޼ҵ�
	public void draw() {
		System.out.println("("+ x +", "+ y +")");
		
	}
	//�ټ�
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
}



//�ڽ� Ŭ����1
class Circle extends Point {
	private int radius;
	
	//������
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius; 
		
	}
	//��
	public void draw() {	//�ݿø� �� �Ҽ��� ù��° �ڸ�����
		float circleArea = (int)((Math.PI * radius * radius)*10+0.5)/10f;
		float circlePerimeter = (int)((2f * Math.PI * radius)*10+0.5)/10f;
		
		System.out.println("���� ��ǥ : ("+super.x+","+super.y+")");
		System.out.println("���� ���� : "+ circleArea);
		System.out.println("���� �ѷ� : "+ circlePerimeter);
	
	}
	//�ټ�
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}


//�ڽ�Ŭ����2
class Rectangle extends Point {
	
	//�ʵ�
	private int width;	//���γʺ�
	private int height;	//���γʺ�
	
	//������
	public Rectangle() {
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	//��
	public void draw() {
		float rectangleArea = (getWidth()*getHeight());
		float rectanglePerimeter = 2*(getWidth()+getHeight());
		
		System.out.println("�簢�� ��ǥ : ("+super.x+","+super.y+")");
		System.out.println("�簢�� ���� : "+rectangleArea);
		System.out.println("�簢�� �ѷ� : "+rectanglePerimeter);

	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	
}




public class inheritanceQuiz {
public static void main(String[] args) {
	
	
	Circle[] c = new Circle[3];
	c[0] = new Circle(1,2,3);
	c[1] = new Circle(2,2,4);
	c[2] = new Circle(3,3,5);
	
	for(int i=0; i<c.length;i++) {
		c[i].draw();
		System.out.println();
	}
	
	Rectangle[] r = new Rectangle[3];
	r[0] = new Rectangle(1, 2, 3, 4);
	r[1] = new Rectangle(2, 2, 4, 4);
	r[2] = new Rectangle(3, 6, 4, 3);
	
	for(int i=0; i<r.length;i++) {
		r[i].draw();
		System.out.println();
	}
	
	
	Point[] pArr = new Point[5];
	pArr[0] = new Circle(1,2,3);
	pArr[1] = new Circle(2,2,4);
	pArr[2] = new Circle(3,4,3);
	pArr[3] = new Rectangle(1,2,3,4);
	pArr[4] = new Rectangle(2,2,2,5);
	
	for(int i=0;i<pArr.length;i++) {
		System.out.println("[ ���� "+ (i+1)+" ]");
		pArr[i].draw();
		System.out.println();
	}
	
//-------------------------------------
	int[] arr = { 1, 2, 3, 4, 5 };
	
	//for-each����
	
	for(int n : arr) {
		System.out.println( n );
	}
	
	System.out.println("-----");
	double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5 };
	for( double d : dArr) {
		System.out.println( d );
	}
	
	//-------------------------------------

	//circle[]�� ���� fo-each����
	for (Circle c1 : c) {
		c1.draw();
		System.out.println();
	}
	
	for(Point p : pArr) {
		p.draw();
		System.out.println("-----------");
	}
	
	
	
	
}
}

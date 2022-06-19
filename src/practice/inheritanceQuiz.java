package practice;

// 부모클래스
class Point {
	
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//메소드
	public void draw() {
		System.out.println("("+ x +", "+ y +")");
		
	}
	//겟셋
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



//자식 클래스1
class Circle extends Point {
	private int radius;
	
	//생성자
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius; 
		
	}
	//메
	public void draw() {	//반올림 후 소수점 첫번째 자리까지
		float circleArea = (int)((Math.PI * radius * radius)*10+0.5)/10f;
		float circlePerimeter = (int)((2f * Math.PI * radius)*10+0.5)/10f;
		
		System.out.println("원의 좌표 : ("+super.x+","+super.y+")");
		System.out.println("원의 면적 : "+ circleArea);
		System.out.println("원의 둘레 : "+ circlePerimeter);
	
	}
	//겟셋
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}


//자식클래스2
class Rectangle extends Point {
	
	//필드
	private int width;	//가로너비
	private int height;	//세로너비
	
	//생성자
	public Rectangle() {
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	//메
	public void draw() {
		float rectangleArea = (getWidth()*getHeight());
		float rectanglePerimeter = 2*(getWidth()+getHeight());
		
		System.out.println("사각형 좌표 : ("+super.x+","+super.y+")");
		System.out.println("사각형 면적 : "+rectangleArea);
		System.out.println("사각형 둘레 : "+rectanglePerimeter);

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
	
	/*
	Circle[] c = new Circle[3];
	c[0] = new Circle(1,2,3);
	c[1] = new Circle(2,2,4);
	c[2] = new Circle(3,3,5);
	
	for(int i=0; i<c.length;i++) {
		c[i].draw();
		System.out.println();
	}
	Rectangle r = new Rectangle(3, 4, 3, 3);
	r.draw();
	*/
	
	Point[] p = new Point[5];
	p[0] = new Circle(1,2,3);
	p[1] = new Circle(2,2,4);
	p[2] = new Circle(3,4,3);
	p[3] = new Rectangle(1,2,3,4);
	p[4] = new Rectangle(2,2,2,5);
	
	for(int i=0;i<p.length;i++) {
		System.out.println("[ 도형 "+ (i+1)+" ]");
		p[i].draw();
		System.out.println();
	}
}
}

package hw5;

/*
請另外建立一個MyRectangleMain類別，此類別只有main方法
(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
*/

public class hw5_Q4_MyRectangleMain {
	public static void main(String[] args) {
		hw5_Q4_MyRectangle area1 = new hw5_Q4_MyRectangle();
		
		area1.setWidth(10);
		area1.setDepth(20);
		area1.setArea();
		System.out.println("長方形的面積為："+ area1.getArea());
		
		hw5_Q4_MyRectangle area2 = new hw5_Q4_MyRectangle(10,20);
		System.out.println("長方形的面積為："+ area2.getArea());
		
		
		
	}
}

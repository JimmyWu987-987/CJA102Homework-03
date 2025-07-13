package hw5;

/*
 * 請設計一個類別MyRectangle：
(1) 有兩個double型態的屬性為width, depth
(2) 有三個方法：
void setWidth(double width): 將收到的引數指定給width屬性
void setDepth(double depth): 將收到的引數指定給depth屬性
double getArea(): 能計算該長方形的面積
(3) 有兩個建構子：
public MyRectangle(): 不帶參數也無內容的建構子
public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性

*/

public class hw5_Q4_MyRectangle implements Display{

	private double width;
	private double depth;
	private double area;

	public hw5_Q4_MyRectangle() {

	}

	public hw5_Q4_MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
		setArea();

	}

	public void setArea() {
		this.area = getWidth() * getDepth();
	}

	public double getArea() {
		return this.area;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getDepth() {
		return this.depth;
	}

	public void display() {
		System.out.println("長方形的面積為：" + this.area);
	}
}

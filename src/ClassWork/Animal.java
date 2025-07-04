package ClassWork;

//• 建立一個class，名為Animal.java
//• 此類別有兩個成員變數分別為age(年紀- 型別int)、weight(體重- 型別float)
//• 此類別需宣告有參數的建構子
//• 有一成員方法名為speak()，用以列印上述兩個值
//• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//  公斤，並呼叫speak方法得到此Animal的成員變數值

public class Animal {

	private int age;
	private float weight;

	public Animal(int age, float weight) {
		if (age > 0)
			this.age = age;

		if (weight > 0)
			this.weight = weight;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public int addAge(int age) {
		return this.age += age;
	}

	public void setWeight(float weight) {
		if (weight > 0)
			this.weight = weight;
	}

	public float getWeight() {
		return this.weight;
	}
	
	public float addWeight(float weight) {
		return this.weight += weight;
	}
	
	public void speak() {
		if (getAge() > 0 && getWeight() > 0) {
			System.out.println("此動物的年紀為：" + getAge() + " 歲");
			System.out.println("此動物的體重為：" + getWeight() + " 公斤\n");
		} else {
			System.out.println("輸入的值不應該為負值，是外星人嗎？");
		}
	}

}

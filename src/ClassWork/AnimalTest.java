package ClassWork;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Animal(2, 5.0f);
		Animal cat = new Animal(3, 10.0f);
		Animal Alien = new Animal(0,-100.0f);

		dog.speak();
//		cat.››.speak();
		
		System.out.println("＝＝＝＝三年後，胖了20公斤＝＝＝＝");
		
		dog.addAge(3);
		dog.addWeight(20.0f);
		dog.speak();
//		cat.speak();
	}

}

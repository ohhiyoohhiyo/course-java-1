package MyStar;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("---Start---");
		Car myCar1 = new Car();
		
		myCar1.a = 100;
		Car myCar2 = myCar1;
		
		myCar1.a = 200;
		
		System.out.println(myCar2.a);

	}

}

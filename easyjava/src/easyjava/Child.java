package easyjava;

public class Child extends Parent {
	// In the sample code above,
	// someMethod is an overridden method in the Child class,
	// because it has the exact same name, number of parameters,
	// and return type as the someMethod method defined inside it’s parent class
	// (conveniently named Parent).

	/*
	 * When overloading, one must change either the type or the number of
	 * parameters for a method that belongs to the same class. Overriding means
	 * that a method inherited from a parent class will be changed. But, when
	 * overriding a method everything remains exactly the same except the method
	 * definition – basically what the method does is changed slightly to fit in
	 * with the needs of the child class. But, the method name, the number and
	 * types of parameters, and the return type will all remain the same. And,
	 * method overriding is a run-time phenomenon that is the driving force
	 * behind polymorphism. However, method overloading is a compile-time
	 * phenomenon.
	 */
	
	// Overloading happens at compile time(오버로딩은 컴파일 시간)
	// Overriding happens at run time(오버라이딩은 실행시간)
	// this is method overriding:
	
	//The conditions for method overloading
	//1.) The number of parameters is different for the methods.
	//2.) The parameter types are different (like 
	//changing a parameter that was a float to an int).
	
	public int someMethod() {
		return 4;
	}

	public void draw(String s) {
		// ...
	}

	public void draw(int i) {
		// ...
	}

	public void draw(double f) {
		// ...
	}

	public void draw(int i, double f) {
		// ...
	}

}

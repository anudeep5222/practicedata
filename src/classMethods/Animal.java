package classMethods;

public class Animal {
	void eat(){
		System.out.println("this animal eats food");
		

	}
}
class Dog extends Animal{
	void bark() {
			
		System.out.println("the dog barks");
	}
}

	public static void main(String[] args) {
		Dog myDog=new Dog();
		myDog.eat();
		myDog.bark();
		
	}

}

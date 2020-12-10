abstract class Animal{
	abstract void says();
	abstract void name();
}
class Cat extends Animal{
	void says(){
		System.out.println("The cat says Meow");
	}
	void name(){
		System.out.println("The name of the cat is Crystal");	
	}
}
class Dog extends Animal{
	void says(){
		System.out.println("The dog says Bow");
	}
	void name(){
		System.out.println("The name of the dog is Dodger");
	}	
}
public class Assign5b{
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.says();
		d.name();
		c.says();
		c.name();
	}
}
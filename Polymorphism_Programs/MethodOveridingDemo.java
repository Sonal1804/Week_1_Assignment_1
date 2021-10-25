//Polymorphism --> Method Overiding

class Parent{
	public void greet(){
		System.out.println("Namaste!!");
	}
}

class Child extends Parent{
	public void greet(){
		System.out.println("Welcome!!");
	}
}

public class MethodOveridingDemo{
	public static void main(String args[]){
		Parent p = new Parent();
		p.greet();
		
		Parent c =new Child();
		c.greet(); 
	}
}
//Polymorphism --> Method Overloading

class AddNumbers{
	void add(int a, int b){
		int res = a+b;
		System.out.println("Addition of 2 nos :"+ res);
	}
	
	void add(int a, int b, int c){
		int res = a+b+c;
		System.out.println("Addition of 3 nos :"+ res);
	}
}

class MethodOverloadingDemo{
	public static void main(String args[]){
		new AddNumbers().add(2,3);
		new AddNumbers().add(5,5,5);
	}
}

class Animal{
	void eat(){
	System.out.println("I can eat");
	}
	void sleep(){
	System.out.println("I can sleep");
	}
}
class Dog extends Animal{
	void bark(){
	System.out.println("I can bark");
	}
}

class Inheritance1{
	public static void main(String args[]){
	Dog dog1= new Dog();
	dog1.eat();
	dog1.sleep(); 

	dog1.bark(); 
       	
     }
}




class 	Myexception2{
	static void divide(int a, int b){
	try{
		if(b==0){
		System.out.println("division not possible");
	throw new ArithmeticException("demo");
		}
		else{
		System.out.println("a/b="+(a/b));
		}
	}
	catch(Exception e){
	System.out.println(e);
	}

	}

public static void main(String arg[]){
	
	divide(20,0);
	}
}

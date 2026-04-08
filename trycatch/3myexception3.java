class 	Myexception3{
	static void divide(int a, int b) throws ArithmeticException{
	
		if(b==0){
		System.out.println("division not possible");
	throw new ArithmeticException("demo");
		}
		else{
		System.out.println("a/b="+(a/b));
		}
	
	}

public static void main(String arg[]){
	try{
	divide(20,0);
	}
	catch(Exception e){
	System.out.println(e);
	}
}
}

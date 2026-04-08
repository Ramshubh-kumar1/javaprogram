class Finallydemo{
	static void proceA(){
	try{
	System.out.println("inside procea");
	throw new RuntimeException("demo");
	}
finally{
	System.out.println("inside finally");
	}
	}
static void proceB(){
	try{
	System.out.println("inside proceB");
	return;
	}
finally{
	System.out.println("inside finallyB");
	}
	}


public static void main (String arg[]){
	try{
	proceA();
	}
	catch(Exception d){
	System.out.println("Exception caught");
	}
 proceB();
	
}
}

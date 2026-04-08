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
//2nd function
static void proceB(){
	try{
	System.out.println("inside proceB");
	return;
	}
finally{
	System.out.println("inside finallyB");
	}
	}
//3rd function
static void proceC(){
	try{
	System.out.println("inside proceC");
	
	}
finally{
	System.out.println("inside finallyC");
	}
	}



public static void main (String arg[]){
	try{
	proceA();
	}
	catch(Exception e){
	System.out.println("Exception caught");
	}
proceB();
 proceC();
 

	
}
}

class 	Myexception{
	static void divide(int a, int b){
		if(b==0){
		System.out.println("division not possible");
		}
		else{
		System.out.println("a/b="+(a/b));
		}
	}

public static void main(String arg[]){
	//Myexception obj1=new Myexception();
	divide(20,2);
	}
}


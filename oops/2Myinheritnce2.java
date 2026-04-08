class A{
	int i,j;
	

}

class B extends A{
	int k;
	void sumij(){
	System.out.println(i+j);
	} 
	void sumijk(){
	System.out.println(i+j+k);
	}
}

class Myinheritnce2{
	public static void main(String args[]){
	
	B subob= new B();
	subob.i=7;
	subob.j=27;
	subob.k=17;

   System.out.println("value of i j ");
	subob.sumij();

   System.out.println("value of i j k");
	subob.sumijk();
	}
}

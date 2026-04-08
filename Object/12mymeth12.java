class Test{
   
void mymeth(int i, int j){
	i=i*2;
	j=j/2;


	}
}
class mymeth12{
	public static void main(String args[]){
	 Test obj1=new Test();
	int a=15;
	int b=20;
	System.out.println("befor  call function"+a +"and"+b);
	obj1.mymeth(a,b);
	System.out.println("after  call function" +obj1.i +"and"+ obj1.j);
	}
}




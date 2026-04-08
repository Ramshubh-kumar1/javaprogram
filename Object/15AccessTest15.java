class Test3{
	int a;
	public int b;
	private int c;
    int setc(int i){
	return c=i;
	}


    }
class AccessTest15{
     public static void main(String args[]){
	 Test3 obj1=new Test3();
         obj1.a=10;
	 obj1.b=20;
	 //obj1.c=30;
int cvalue=obj1.setc(30);

 System.out.println(" obj1="+ cvalue); 


	
         System.out.println(" obj1="+ obj1.a); 
         System.out.println(" obj1="+ obj1.b);
	//System.out.println(" obj1="+ obj1.c);


     }
}

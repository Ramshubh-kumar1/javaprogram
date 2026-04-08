class Test4{
	int a;
	public int b;
	private int c;
    void setc(int i){
	c=i;
	}
 int getc(){
    return c;
    }

    }
class AccessTest16{
     public static void main(String args[]){
	 Test4 obj1=new Test4();
         obj1.a=10;
	 obj1.b=20;
	obj1.setc(30);

 System.out.println(" obj1="+ obj1.getc()); 


	
         System.out.println(" obj1="+ obj1.a); 
         System.out.println(" obj1="+ obj1.b);
	
     }
}
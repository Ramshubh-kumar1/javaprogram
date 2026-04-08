class Test2{
	int a;
    Test2(int i){
	a=i;
     }
    Test2 incerByten(){
	Test2 temp= new Test2(a+10);
	return temp;
	}
}
class ReturnObj14{
     public static void main(String args[]){
	 Test2 obj1=new Test2(2);
         Test2 obj2;
	 obj2=obj1.incerByten();
         System.out.println(" obj1="+ obj1.a); 
         System.out.println(" obj1="+ obj2.a);

	obj2=obj2.incerByten();
System.out.println(" obj1="+ obj2.a);
     }
}
	

	
	
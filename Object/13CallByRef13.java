class Test1{
	int a,b;
	Test1(int i, int j){
	a=i;
	b=j;
      }
void meth(Test1 o){
	o.a=o.a*2;
	o.b=o.b/2;
     }
}

class CallByRef13{
     public static void main(String args[]){
        Test1 obj1=new Test1(15,20);
        System.out.println(" befor  call ob.a and ob.b="+obj1.a +"and"+ obj1.b);
	obj1.meth(obj1);
        System.out.println(" after  call ob.a and ob.b="+obj1.a +"and"+ obj1.b);
     }
}



	


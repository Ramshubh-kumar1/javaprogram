class Calculate{
	void test(){
		System.out.println("no parameter");
		}
	void test(int a, int b){
		System.out.println("sum="+(a+b));
		}

	void test(double a){
		System.out.println("value a="+ a);
		}
}
class Overloading_cons10{
	public static void main(String arg[]){

 	Calculate obj=new Calculate();
	obj.test(8,5);
	obj.test(4.8);
	obj.test();
	}
}


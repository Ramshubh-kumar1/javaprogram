class Calculate{
	void sum(int a, int b){
		System.out.println("sum="+(a+b));
		}

	void sum(double a, double b){
		System.out.println("sum="+(a+b));
		}
}
class Overloading_cons9{
	public static void main(String arg[]){

 	Calculate cal=new Calculate();
	cal.sum(8,5);
	cal.sum(4.8,9.3);
	}
}














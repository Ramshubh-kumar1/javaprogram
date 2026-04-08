class Box{
	double length, height, width;

	Box(double l, double h, double w){
	length=l;   
	height=h;
	width=w;
	}
	
	double volume(){
	 return length*height*width;
	}
}
class Constructor_value_parameter{
	public static void main(String arg[]){

	Box box1=new Box(30,40,10);
	double v=box1.volume();
	System.out.println("volume is ="+v);
	
	Box box2=new Box(50,40,10);
	 v=box2.volume();
	System.out.println("volume is ="+v);

	}
}
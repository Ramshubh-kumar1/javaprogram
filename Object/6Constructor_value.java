class Box{
	double length, height, width;

	Box(){
	length=10;
	height=30;
	width=40;
	}
	
	double volume(){
	 return length*height*width;
	}
}
class Constructor_value{
	public static void main(String arg[]){
	Box box1=new Box();
	double v=box1.volume();
	System.out.println("volume is ="+v);
	}
}
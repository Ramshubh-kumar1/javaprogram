class Box{
	double length;
	double width;
	double height;
}
class Demo1{
	public static void main(String arg[]){
	
	Box box1=new Box();
	box1.length=10;
	box1.width=15;
	box1.height=30;
	double volume=box1.length*box1.width*box1.height;
	System.out.print("volume of box1="+volume);
	}
}
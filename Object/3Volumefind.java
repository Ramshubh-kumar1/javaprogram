class Box{
	double length, height, width;
	
	void volume(){
	System.out.println("Volume is="+(length*height*width));
	}
}
class Volumefind{
	public static void main(String arg[]){
	Box box1=new Box();
	box1.length=10;
	box1.height=20;
	box1.width=30;
	box1.volume();
	}
}
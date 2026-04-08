class Box{
	double length, height, width;

	void setDim(double l, double h, double w ){
	this.length=l;
	this.height=h;
	this.width=w;
	}
	
	double volume(){
	 return length*height*width;
	}
}
class Volumefind2{
	public static void main(String arg[]){
	Box box1=new Box();
	box1.setDim(10,20,30);
	double v=box1.volume();
	System.out.println("volume is ="+v);

	Box box2=new Box();
	box2.setDim(20,20,30);
	 v=box1.volume();
	System.out.println("volume is 2nd  ="+v);


	}
}
class Box_Over{
	double width, height, depth;
	
	Box_Over(double w, double h,double d){
	   width=w;
           height=h;
           depth=d;
	}
	Box_Over(){
	width= height= depth=0;
	}

        Box_Over(double len){
	width= height=depth= len;
	}

      double volume(){
   	return width* height* depth;
	}
}

class Overloading_cons11{
	public static void main(String arg[]){
	
	Box_Over mybox1=new Box_Over(10,20,15);
        Box_Over mybox2=new Box_Over();
	Box_Over mybox3=new Box_Over(8);

 	double vol;
	vol=mybox1.volume();
 	System.out.println("mybox 1=" +vol);

	vol=mybox2.volume();
 	System.out.println("mybox 2="+ vol);

	vol=mybox3.volume();
 	System.out.println("mybox 3=" +vol);
	}
}



	
	

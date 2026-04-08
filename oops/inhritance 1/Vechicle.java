package maypackheritance;

public class Vechicle{

	protected int numberoftires;
	public void setnumberoftires(int numberoftires){
	this.numberoftires= numberoftires;
	}
 @Override
 public String toString(){
    return "Vechicle no of tires" + numberoftires;
   } 

	public void commute(){
	System.out.println(" i am going from place a to place b using %d tires\n", numberoftires);
 	}
}
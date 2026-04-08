class Newthread implements Runnable{
	String name;
	Thread t;

 	Newthread(String threadname){
	name=threadname;
	t=new Thread(this.name);
System.out.println("new thread :"+ t);
 t.start();
	 }
public void run(){
	try{
	for(int i=5; i>0; i++){
       System.out.println(name +":" + i);
       Thread.sleep();
	    }
     }

catch(InterruptedException e){
	System.out.println(name +"interrupted");
System.out.println(name+ "existing");
     
}
}
class Multi5{
public static void main(String arg[]){
	Newthread t1= new Newthread("one");
	Newthread t2= new Newthread("one");
	Newthread t3= new Newthread("one");

	try{
	Thread.sleep(5000);
	}
	catch(InterruptedException e){
	System.out.println("main thread interrupted");
	 }
System.out.println(" main thread existing");
	}
  }
}	
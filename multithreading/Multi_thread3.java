
class Multi_thread3 extends Thread
{
 	public void run(){
	 System.out.println("thread is running");
	}
public static void main(String arg[]){
 	
  Multi_thread3 m2= new Multi_thread3();
  m2.start();
 }

}

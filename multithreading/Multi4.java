class Multi4 implements Runnable{
	public void run(){
	System.out.println("thread is running runnable method");
       }

public static void main(String arg[]){
	Multi4 m3 =new Multi4();
	Thread t1 =new Thread(m3);
      t1.start();
	}
}
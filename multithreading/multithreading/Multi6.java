class Multi6 extends Thread{
	public void run(){
	System.out.println("running thread name is :"+ Thread.currentThread().getName());

System.out.println("running thread priority is :"+ Thread.currentThread().getPriority());
	}
public static void main(String arg[]){
	 Multi6 obj1= new Multi6();
	Multi6 obj2= new Multi6();

obj1.setPriority(Thread.MIN_PRIORITY);
obj2.setPriority(Thread.MAX_PRIORITY);

obj1.start();
obj2.start();
	}
}
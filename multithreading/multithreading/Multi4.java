class Threaddemo implements Runnable{
	public void run(){
	System.out.println("Thread"+ Thread.currentThread()+"is running");
	}
}

class Multi4{
	public static void main(String arg[]){
	int n=5;
	for(int i=1; i<=n; i++){
 	Thread obj1= new Thread(new Threaddemo());
	obj1.start();
	}
}
}
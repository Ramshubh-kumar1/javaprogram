class Mythreading5 implements Runnable{
	public void run(){
	try{
	for(int t=5; t>0; t--){
System.out.println("child thread="+ t);
    Thread.sleep(1000);
	  }
	}
catch(InterruptedException e){
   System.out.println("interrupted");
   }
System.out.println("child thred is existing");
}

public static void main(String arg[]){
	Mythreading5  m1= new Mythreading5();
	Thread thd2= new Thread(m1);
        thd2.start();
    try{
	for(int n=5; n>0; n--){
            System.out.println("main thread="+ n);
               Thread.sleep(5000);
	       }
	}
      catch(InterruptedException e){
            System.out.println(" main thread interrupted");
               }
        System.out.println("main thred is existing");
}
}



	
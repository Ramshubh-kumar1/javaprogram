class Multi7 extends Thread{
	 public void run(){

	try{
		for(int i=5; i>0; i--){
		System.out.println(Thread.currentThread().getName()+ ":"+i);
               Thread.sleep(1000);
	       }
       }
catch(InterruptedException e){
     System.out.println(Thread.currentThread().getName()+ "interrupted");
    }
}

public static void main(String arg[]){
	Multi7 obj1= new Multi7();
	Multi7 obj2= new Multi7();
	Multi7 obj3= new Multi7();
  obj1.setName("one");
  obj2.setName("two");
  obj3.setName("three");

 obj1.setPriority(Thread.MAX_PRIORITY);
 obj2.setPriority(Thread.NORM_PRIORITY);
  obj3.setPriority(Thread.MIN_PRIORITY);

obj3.start();
obj2.start();
obj1.start();

   
	}
}   
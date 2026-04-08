class Multi_thread2{

	public static void main(String arg[]){
	Thread t1= Thread.currentThread();
	t1.setName("java1");
     System.out.println("after change name ="+ t1);
	t1.setPriority(9);
     System.out.println("after change name ="+ t1);

try{
   for(int n=5; n>0; n--){
      System.out.println(n);
      Thread.sleep(5000);
      }
   }

catch (InterruptedException e){
    System.out.println("main thread interrupted");
    }

	}
}

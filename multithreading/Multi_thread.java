class Multi_thread{

	public static void main(String arg[]){
	Thread t1= Thread.currentThread();
	t1.setName("java1");
     System.out.println("after change name ="+ t1);
	t1.setPriority(9);
     System.out.println("after change name ="+ t1);

	}
}



class Printer{
	public void printmessage(String message){
	System.out.print("["+ message);

	try{
	Thread.sleep(500);
          }
        catch(InterruptedException e){
	System.out.println("thread interrupted");
         }
	System.out.println("]");
	}
}
// thread class

class MessageThread extends Thread{
	private Printer printer;
	private String message;

	public MessageThread(Printer Printer, String messgae){
           this.printer= printer;
	   this.message= message;

public void run(){
	printer.printerMessage(message);
 }
}
// main class

public class Multi9 
 	public static void main(String arg[]){
	printer

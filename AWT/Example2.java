import java.awt.*;

class Example2 extends Frame{

   void Example(String msg){
        setSize(500,700);
	setVisible(true);
	setTitle(msg);
       }

  public static void main(String[] arg){
	Example2 f1=  new Example2();
         f1.Example("example");

		}
}
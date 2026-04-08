import java.awt.*;
import java.awt.event.*;

class ExampleButton extends Frame implements ActionListener{
	TextField tf;
	ExampleButton(){
		setLayout(null);
		setVisible(true);
		setSize(500,500);
	tf = new TextField();
	tf.setBounds(60,50,170,30);

Button b1 = new Button("Add");
b1.setBounds(60,150,170,30);
b1.setActionCommand("one");

Button b2 = new Button("Sub");
b2.setBounds(60,250,170,30);
b2.setActionCommand("two");

b1.addActionListener(this);
b2.addActionListener(this);

add(b1);
add(b2);
add(tf);
}
public void actionPerformed(ActionEvent ae){
	String s = ae.getActionCommand();
	tf.setText(s);
	}

public static void main(String arg[]){
	ExampleButton obj =new ExampleButton();
	}
}



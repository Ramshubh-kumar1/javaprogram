import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExampleCal extends JFrame implements ActionListener{
	JTextField tf1, tf2, tf3;
ExampleCal(){
		setLayout(null);
		setVisible(true);
		setSize(500,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel l1 = new JLabel("enter first number");
l1.setBounds(60,80,170,50);

tf1=new JTextField();
tf1.setBounds(250,80,170,50);

JLabel l2 = new JLabel("enter second number");
l2.setBounds(60,155,170,50);

tf2=new JTextField();
tf2.setBounds(250,155,170,50);

JLabel l3 = new JLabel("result");
l3.setBounds(60,230,170,50);

tf3=new JTextField();
tf3.setBounds(250,230,170,50);

JButton b1= new JButton("+");
b1.setBounds(60,305,170,50);
b1.addActionListener(this);
b1.setActionCommand("add");


JButton b2= new JButton("-");
b2.setBounds(250,305,170,50);
b2.addActionListener(this);
b2.setActionCommand("sub");

add(l1);
add(tf1);
add(l2);
add(tf2);
add(l3);
add(tf3);
add(b1);
add(b2);
 }
public void actionPerformed(ActionEvent ae){
	String num1=tf1.getText();
	String num2=tf2.getText();

try{
	int n1=Integer.parseInt(num1);
	int n2=Integer.parseInt(num2);
	String s=ae.getActionCommand();

       int result=0;
 if(s=="add")
 {
    result=n1+n2;
 }

 if(s=="sub")
 {
    result=n1-n2;
 }
	tf3.setText(result+"");	
	}
catch(Exception e)
 {
 JOptionPane.showMessageDialog(this, "enter valid number");
   tf1.setText("");
   tf2.setText("");
   tf3.setText("");
 }
}
public static void main(String arg[]){
	ExampleCal obj = new ExampleCal();
  }
}




package utils.calculator;

import challenge77.geometry.Circle;
import challenge77.geometry.Rectangle;

public class Calculator{
    public static void main (String arg[]){
        Circle cir = new Circle(5.5);
        Rectangle rec  = new Rectangle(10,5);

        double cirarea =Math.PI* Math.pow(cir.radius,2);
        double recarea= rec.bredth* rec.length;
        System.out.println(cirarea);
                System.out.println(recarea);


    }
}
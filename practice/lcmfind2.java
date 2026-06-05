
import java.util.Scanner;

class Lcmfind2 {
    public static void main(String[] args)
    {

       // Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter first number: ");
       // int num1 = scanner.nextInt();

       // System.out.print("Enter second number: ");
        //int num2 = scanner.nextInt();

		int num1 = 15, num2 = 5;

                int smallNum = (num1 < num2) ? num1 : num2;
		int result=1;
		int lcm=0;

		for(int i=2; i<=smallNum; i++){
		   if(num1 % i==0 && num2 % i==0 ){
			int[] result2 =i;
			
			}
                  lcm=(num1*num2)/i;
               System.out.println(i);
		}
           
             

              System.out.println("LCM of " + num1 + " and " + num2
                           + " =  " + lcm);
               
        }
}
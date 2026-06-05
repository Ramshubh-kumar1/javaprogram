
import java.util.Scanner;

class Lcmfind {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();



        //int a = 15, b = 25;

                int lcm = (num1 > num2) ? num1 : num2;

               while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0)
                break;
            lcm++;
        }

              System.out.println("LCM of " + num1 + " and " + num2
                           + " : " + lcm);
    }
}
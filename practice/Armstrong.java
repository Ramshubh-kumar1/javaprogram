import java.util.Scanner;

class Armstrong {
  public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = scanner.nextInt();

    int original = num;
    int result = 0;
    int Vpower = String.valueOf(num).length();

    while (num != 0) {
      int reminder = num % 10;
      result += Math.pow(reminder, Vpower);
      num /= 10;

       }
  

    System.out.println(original + (result == original ? " is Armstrong" : " is not Armstrong"));
  }
}

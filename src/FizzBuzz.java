import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args) {
        /*
         if the number is dividable by 5 print Fizz, if not, print  buzz; if it divisible
         by both 3 and 5
         print FizzBuzz and if it is not divisible by any, return the number.
        */
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the number: ");
        input = scanner.nextInt();

        if (input % 5 == 0 && input % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (input % 5 == 0) {
            System.out.println("Fizz");
        } else if (input % 3 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(input);

        scanner.close();
    }
}

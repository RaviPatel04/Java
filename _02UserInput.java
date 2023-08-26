
import java.util.Scanner;
public class _02UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number 1: ");
        int a = scanner.nextInt();

        System.out.println("Enter a number 2: ");
        int b = scanner.nextInt();

        int sum = a+b;

        System.out.println("Sum of two number is: ");
        System.out.println(sum);

        System.out.println("Enter a b1:");
        boolean b1 = scanner.hasNextInt();// This is checked b1 is int or not
        System.out.println(b1);
        scanner.close();

    }
}

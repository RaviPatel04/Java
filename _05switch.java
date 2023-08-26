import java.util.Scanner;
public class _05switch {
    public static void main(String[] args) {
        System.out.println("Enter a first two letter of day:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 's' -> System.out.println("Today is sunday!!");
            case 'm' -> System.out.println("Today is monday!!");
            case 't' -> System.out.println("Today is tuesday!!");
            case 'w' -> System.out.println("Today is wednesday!!");
            case 'T' -> System.out.println("Today is Thursday!!");
            case 'f' -> System.out.println("Today is friday!!");
            case 'S' -> System.out.println("Today is Saturday!!");
            default -> System.out.println("Not a valid letter!!");
        }
        sc.close();
    }
}

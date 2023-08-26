
import java.util.Random;
import java.util.Scanner;

public class game2 {
    static void my(){
        Scanner sc = new Scanner(System.in);

        Random rm = new Random();
        int computer_num = rm.nextInt(100);

        int attempt = 0;
        while (true) {
            attempt++;
            System.out.printf("Enter a number between 1-100:");
            int user_num = sc.nextInt();

            if (computer_num > user_num) {
                System.out.println("Number is greater");
            } else if (user_num > computer_num) {
                System.out.println("Number is smaller");
            } else if (computer_num == user_num) {
                System.out.println("congratulation!! you won.");
                System.out.println("You have won game in " + attempt + " attempt.");
                System.out.println("\nPlay again?? press 1\n exit?? press 2\n Enter n:");
                int n = sc.nextInt();
                if (n == 1){
                    continue;
                }
                else {

                    System.exit(0);
                }
            }
            sc.close();
        }

    }
    public static void main(String[] args) {
            my();
    }


}

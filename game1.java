import java.util.Random;
import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {

        System.out.print(" 1.rock\n 2.paper\n 3.scissor\n Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt(4);

        Random ran = new Random();
        int computerInput = ran.nextInt(3)+1;

        if (userInput == computerInput){
            System.out.println("Game Draw!!");
        } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1 || userInput == 3 && computerInput == 2) {
            System.out.println("congratulation.You win!!");
        }
        else {
            System.out.println("Computer win!!");
        }
        System.out.println("Computer choice:"+computerInput);
        sc.close();

    }
}
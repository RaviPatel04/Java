import java.util.Scanner;
public class _04if_else {
    public static void main(String[] args) {
        System.out.println("Enter a age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for licence");
        }
        else {
            System.out.println("You are not eligible for licence");
        }
        sc.close();
    }
    
}

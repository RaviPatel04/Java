import java.util.*;

public class _13recursion {
    static int factorial(int n){
        if (n== 0|| n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.printf("Enter a number you want to find factorial:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf(n+"! = "+factorial(n));
        sc.close();
    }
}

import java.util.Scanner;

public class sum22{
    private int num;
    sum22(int number){
        this.num = number;
    }
    public void vote(){
        
        for(int i = 1; i <= num; i++){

            if(i == 8){
                System.out.println("Number is 8, so loop break!!");
                break;
            }
            if(i == 3){
                System.out.println("Number is 3, so loop continue!!");
                continue;
            }
            System.out.println(i);
        }
    }

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        
        
        sum22 s = new sum22(number);
        s.vote();
        sc.close();

    }
}





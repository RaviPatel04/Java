import java.util.Scanner;

interface shape1{
    void circlearea(int r);
}
interface shape2{
    void rectanglearea(int length, int breath);
}

class Area implements shape1,shape2{

    public void circlearea(int r){
        System.out.println("Circle area: " + Math.PI*r*r);
    }
    public void rectanglearea(int length, int breath){
        System.out.println("Rectangle area: " + length*breath);
    }
}
public class sum21 {   
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a redius r, length l and breadth b: ");
        int r = sc.nextInt();
        int l = sc.nextInt();
        int b =sc.nextInt();
        
        Area a = new Area();
        a.circlearea(r);
        a.rectanglearea(l, b);
        sc.close();
    }

}

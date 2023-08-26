public class _09break_and_continue {
    public static void main(String[] args) {
        System.out.println("break");
        for (int i=1; i<=10;i++){
            if (i == 3){
                break;
            }
            System.out.println(i);

        }
        System.out.println("continue");
        for (int i=1; i<=10;i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);

        }

    }
}

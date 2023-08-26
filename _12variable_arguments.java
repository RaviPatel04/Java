public class _12variable_arguments {
    static int add(int ...arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
        public static void main(String[] args){
            System.out.println(add(1,2));
            System.out.println(add(3,4,5));
            System.out.println(add(90,50,10));
        }
}

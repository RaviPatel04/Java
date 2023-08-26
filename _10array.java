public class _10array {
    public static void main(String[] args) {
        int []marks = new int[5];
        marks[0]=90;
        marks[1]=80;
        marks[2]=70;
        marks[3]=60;
        marks[4]=50;
        System.out.println(marks[2]);
        System.out.println("using for loop-->");
        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("using for-each loop-->");
        for (int element :marks){
            System.out.println(element);

        }
        int [][]flats = new int[2][3];
        System.out.println("using 2-D array-->");
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int i=0; i < flats.length;i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }

    }
}

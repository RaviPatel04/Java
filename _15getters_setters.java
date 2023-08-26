class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class _15getters_setters {
    public static void main(String[] args) {
        MyEmployee ravi = new MyEmployee();

        ravi.setName("ravi patel");
        System.out.println(ravi.getName());
        ravi.setId(23);
        System.out.println(ravi.getId());
    }

}

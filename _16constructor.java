class employee{
    private int id;
    private String name;
    public employee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public employee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
public class _16constructor {
    public static void main(String[] args) {
        employee harry = new employee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }

}

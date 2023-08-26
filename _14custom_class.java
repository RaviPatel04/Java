class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class _14custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ravi = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for ravi
        ravi.id = 23;
        ravi.salary = 100;
        ravi.name = "ravi patel";

        // Setting Attributes for John
        john.id = 13;
        john.salary = 50;
        john.name = "John jin";

        // Printing the Attributes
        ravi.printDetails();
        john.printDetails();
        int salary = ravi.salary;
        int salary1 = john.getSalary();
        System.out.println(salary);
        System.out.println(salary1);

        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}

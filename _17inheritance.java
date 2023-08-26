class Base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}

class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("I am in derived and setting Y now");
        this.y = y;
    }
}

public class _17inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(13);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(23);
        System.out.println(d.getY());
    }
}

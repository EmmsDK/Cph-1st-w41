package Task1;

public class Driver {

    private int age;
    private String name;

    public Driver(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    public void setAge(int age){
        this.age = 21;
    }

    public String toString() {
        String s;
        s = "Is driven by "+name;
        return s;
    }

}

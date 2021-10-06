package Task1;

public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("Emilio", 21);

        Car c1 = new Car("HYUNDAI", "GENESIS", 2011, "FAMILY", "WILLIAM");
        Car c2 = new Car("MERCEDES-BENZ","B ELECTRIC DRIVE", 2015, "SPORT", "NICK");

        c1.setDriver(d1);
        c2.setDriver(d1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(d1);


    }

}

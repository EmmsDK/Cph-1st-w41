package Task2;

public class Main {
    public static void main(String[] args) {

        Room r1 = new Room(4, 2, 2, 8);
        Room r2 = new Room(4, 1, 0, 0);
        Room r3 = new Room(6, 1, 20, 10);

        Building b1 = new Building(4,2,1,false);

        int sumLamps = r1.numberOfLamps + r2.numberOfLamps + r3.numberOfLamps;
        System.out.println("total number of lamps in this building is "+ sumLamps);


    }
}

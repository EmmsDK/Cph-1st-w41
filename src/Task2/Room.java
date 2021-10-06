package Task2;

public class Room {

    int walls;
    int numberOfDoors;
    int numberOfLamps;
    int numberOfWindows;

    public Room(int _walls, int _numberOfDoors, int _numberOfLamps, int _numberOfWindows) {
        this.walls = _walls;
        this.numberOfDoors = _numberOfDoors;
        this.numberOfLamps = _numberOfLamps;
        this.numberOfWindows = _numberOfWindows;
    }

    public int getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}

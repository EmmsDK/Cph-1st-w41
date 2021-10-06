package Task2;

public class Building {
    int Rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;

    public Building(int _rooms, int _numberOfBathrooms, int _numberOfFloors, boolean _isOfficeBuilding) {
        this.Rooms = _rooms;
        this.numberOfBathrooms = _numberOfBathrooms;
        this.numberOfFloors = _numberOfFloors;
        this.isOfficeBuilding = _isOfficeBuilding;
    }

    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}

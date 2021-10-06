package Task1;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;

    public Car(String _make, String _model, int _year, String _bodyStyle, String _driver) {
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.bodyStyle = _bodyStyle;
        this.driver = _driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(Driver d1) {
        this.driver = driver;

    }

    public String toString(){
        String s;
        s = "Make: "+make+". Model: "+model+ " ("+ year + "), bodyStyle: " +bodyStyle;
    return s;
    }

}

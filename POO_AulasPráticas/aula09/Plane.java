package aula09;

public class Plane {
    private String id;
    private String manufacturer;
    private String model;
    private int year;
    private int maxPassengers;
    private int maxSpeed;

    public Plane(String id, String manufacturer, String model, int year, int maxPassengers, int maxSpeed) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public Plane(String id, String model, int year, int maxPassengers, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public Plane(String id, String model, int year, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getId() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", maxPassengers=" + maxPassengers +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getPlaneType() {
        return "";
    }
}



package aula09;

public class MilitaryPlane extends Plane {
    private int ammunition;

    public MilitaryPlane(String id, String manufacturer, String model, int yearOfProduction, int maxPassengers, int maxSpeed, int ammunition) {
        super(id, manufacturer, model, yearOfProduction, maxPassengers, maxSpeed);
        this.ammunition = ammunition;
    }

    public MilitaryPlane(String id, String manufacturer, String model, int yearOfProduction, int maxPassengers, int maxSpeed) {
        super(id, manufacturer, model, yearOfProduction, maxPassengers, maxSpeed);
    }
    

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ammunition: " + ammunition;
    }

    @Override
    public String getPlaneType() {
        return "Military";
    }
}
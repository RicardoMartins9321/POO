package aula09;

public class CommercialPlane extends Plane {
    private int numCrew;

    public CommercialPlane(String id, String manufacturer, String model, int year, int maxPassengers, int maxSpeed, int numCrew) {
        super(id, manufacturer, model, year, maxPassengers, maxSpeed);
        this.numCrew = numCrew;
    }

    public CommercialPlane(String id, String model, int year, int maxPassengers, int maxSpeed, int numCrew) {
        super(id, model, year, maxPassengers, maxSpeed);
        this.numCrew = numCrew;
    }


    public int getNumCrew() {
        return numCrew;
    }

    public void setNumCrew(int numCrew) {
        this.numCrew = numCrew;
    }

    @Override
    public String toString() {
        return super.toString() + ", numCrew=" + numCrew +'}';
    }

    @Override
    public String getPlaneType() {
        return "Commercial";
    }
}

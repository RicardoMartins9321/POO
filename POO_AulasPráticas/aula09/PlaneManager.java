package aula09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaneManager {
    
    private Map<String, Plane> planes;
    
    public PlaneManager() {
        this.planes = new HashMap<>();
    }
    
    public void addPlane(Plane plane) {
        this.planes.put(plane.getId(), plane);
    }
    
    public Plane removePlane(String id) {
        return this.planes.remove(id);
    }
    
    public Plane searchPlane(String id) {
        return this.planes.get(id);
    }
    
    public List<CommercialPlane> getCommercialPlanes() {
        List<CommercialPlane> commercialPlanes = new ArrayList<>();
        for (Plane plane : this.planes.values()) {
            if (plane instanceof CommercialPlane) {
                commercialPlanes.add((CommercialPlane) plane);
            }
        }
        return commercialPlanes;
    }
    
    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : this.planes.values()) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }
    
    public void printAllPlanes() {
        for (Plane plane : this.planes.values()) {
            System.out.println(plane.toString());
        }
    }
    
    public Plane getFastestPlane() {
        Plane fastestPlane = null;
        int maxSpeed = 0;
        for (Plane plane : this.planes.values()) {
            if (plane.getMaxSpeed() > maxSpeed) {
                maxSpeed = plane.getMaxSpeed();
                fastestPlane = plane;
            }
        }
        
        return fastestPlane;
    }
}

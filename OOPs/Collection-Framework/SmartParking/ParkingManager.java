package SmartParking;

import java.util.*;

public class ParkingManager {

    ArrayList<String> vehicles = new ArrayList<>();

    public void addVehicle(String no) {
        vehicles.add(no);
    }

    public void removeVehicle(String no) {
        vehicles.remove(no);
    }

    public void searchVehicle(String no) {

        if (vehicles.contains(no))
            System.out.println("Vehicle Found");
        else
            System.out.println("Vehicle Not Found");
    }

    public void display() {

        for(String v:vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots : "+vehicles.size());
    }
}
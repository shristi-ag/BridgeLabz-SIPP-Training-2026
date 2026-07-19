package SmartParking;

public class ParkingMain {

    public static void main(String[] args) {

        ParkingManager p = new ParkingManager();

        p.addVehicle("UP32AB1234");
        p.addVehicle("DL01XY5678");

        p.searchVehicle("DL01XY5678");

        p.removeVehicle("UP32AB1234");

        p.display();
    }
}
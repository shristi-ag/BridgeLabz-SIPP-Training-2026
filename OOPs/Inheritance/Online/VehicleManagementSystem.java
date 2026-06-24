package Online;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(220, "Honda City");

        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}
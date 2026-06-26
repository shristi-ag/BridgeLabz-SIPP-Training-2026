package VehicleRentalSystem;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("UP81AB1234", "Car", 1500);

        Bike bike = new Bike("UP81CD5678", "Bike", 600);

        Truck truck = new Truck("UP81EF9999", "Truck", 2500, 3000);

        int days = 5;

        System.out.println("----- Car -----");
        car.displayVehicleInfo();
        System.out.println("Rental Cost : " + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Bike -----");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost : " + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Truck -----");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost : " + truck.calculateRentalCost(days));
    }
}
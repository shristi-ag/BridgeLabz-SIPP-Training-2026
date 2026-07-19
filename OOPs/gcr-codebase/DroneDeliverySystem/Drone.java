package DroneDeliverySystem;

public class Drone {
    String DroneId;
    int batteryPercentage;

    static String companyName;

    Drone(String DroneId, int batteryPercentage) {
        this.DroneId = DroneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {

        if (batteryPercentage >= 20) {
            System.out.println("Drone " + DroneId + " started delivery.");
        } else {
            System.out.println("Drone " + DroneId + " has low battery. Delivery cannot start.");
        }
    }

    void displayStatus() {
        System.out.println("Drone ID: " + DroneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        Drone.companyName = "Skylogistics";
        Drone drone1 = new Drone("1011", 85);
        System.out.println("-----------------------------------");
        System.out.println("Skylogistics");
        System.out.println("-----------------------------------");
        Drone drone2 = new Drone("2022", 75);
        Drone drone3 = new Drone("3033", 10);

        drone1.startDelivery();
        drone1.displayStatus();

        drone2.startDelivery();
        drone2.displayStatus();

        drone3.startDelivery();
        drone3.displayStatus();
    }
}
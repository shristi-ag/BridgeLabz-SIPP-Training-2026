package ChargingStation;

class ChargingSta {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5;

    // Instance Variables
    String stationId;
    double unitsConsumed;

    // Constructor
    ChargingSta(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate);
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println();
    }

    public static <ChargingStat> void main(String[] args) {

        ChargingSta s1 = new ChargingSta("CS101", 120);
        ChargingSta s2 = new ChargingSta("CS102", 150);
        ChargingSta s3 = new ChargingSta("CS103", 200);
        ChargingSta s4 = new ChargingSta("CS104", 175);
        ChargingSta s5 = new ChargingSta("CS105", 220);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);
    }
}
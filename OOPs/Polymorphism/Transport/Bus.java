package Transport;

public class Bus extends Vechile{
    public Bus(String vechileNumber) {
        super(vechileNumber);
    }
    @Override
    public  double fuelCost(double km) {
        return km * 15;

    }

}

package Transport;

public class Bike extends Vechile{


    public Bike(String vechileNumber) {
        super(vechileNumber);
    }


    @Override
    public   double fuelCost(double km){
        return km*3;
    }

}

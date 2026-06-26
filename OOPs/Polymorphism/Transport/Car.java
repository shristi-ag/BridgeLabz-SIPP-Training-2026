package Transport;

public class Car extends Vechile{

    public Car(String vechileNumber) {
        super(vechileNumber);
    }
    @Override
    public  double fuelCost(double km){
        return
        km*10;

    }

}

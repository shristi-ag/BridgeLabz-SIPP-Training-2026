package Transport;

public  abstract class Vechile {
    protected String VechileNumber;


    public Vechile(String vechileNumber){
        VechileNumber = vechileNumber;
    }
    public  abstract double fuelCost(double km);


}

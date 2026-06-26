package Transport;

public class Main {
    public static void main(String[] args) {
        double distance = 100;
        Vechile[] fleet = {
                new Bike("BIKE101"),
                new Car("CAR304"),
                new Bus("BUS201")
        };
        for (Vechile v : fleet) {
            System.out.println("The Vechile number is"+v.VechileNumber);


            System.out.println("Cost Per" + distance + "km is");
            if(v instanceof Car){
                System.out.println("This is a Car");
            }
            else if(v instanceof Bike){
                System.out.println("This is a bike");
            }
            else if(v instanceof Bus){
                System.out.println("This is Bus");

            }

            else{
                System.out.println("Invalid Vechicle Type");


                System.out.println("--------------------------------");
            }


        }
    }
}

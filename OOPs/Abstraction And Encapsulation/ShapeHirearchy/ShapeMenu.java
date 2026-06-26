package ShapeHirearchy;
import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs {

    Shape s;

    @Override
    public void choices() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Rectangle \n2. Circle \n3. Triangle \n4. Exit");
            int choice = sc.nextInt();

            if(choice == 4) {
                break;
            }

            switch(choice) {
                case 1:

                    s = new Rectangle();
                    new Rectangle().setLength(100);
                    new Rectangle().setBreadth(10);
                    s.area();
                    s.perimeter();
                    break;

                case 2:
                    s = new Triangle();
                    new Triangle().setBase(18);
                    new Triangle().setHeight(5);
                    new Triangle().setSide1(10);
                    new Triangle().setSide2(15);
                    new Triangle().setSide3(25);

                    s.area();
                    s.perimeter();
                    break;

                case 3:
                    new Circle().setradius(5);
                    s = new Circle();

                    s.area();
                    s.perimeter();
                    break;

                default:
                    System.out.println("Invalid Choices!!!");
            }
        }
    }
}
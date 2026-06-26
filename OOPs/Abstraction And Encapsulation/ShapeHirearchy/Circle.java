package ShapeHirearchy;

public class Circle extends Shape {
    private int radius;
    final private double pi= 3.14;


    public void setradius(int radius){
        this.radius=radius;
    }

    @Override
    public void area(){
        Circle c = new Circle();
        System.out.println("Area of Circle:-"+pi*(c.radius*c.radius));
    }

    @Override

    public  void perimeter(){
        Circle c = new Circle();
        System.out.println("Perimeter of Circle:-"+2*c.pi*c.radius);

    }
}

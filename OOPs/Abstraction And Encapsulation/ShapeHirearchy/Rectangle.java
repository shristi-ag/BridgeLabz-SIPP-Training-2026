package ShapeHirearchy;

public class Rectangle extends Shape{


    private int length;
    private int breadth;

    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    @Override
    public void area(){
        Rectangle r = new Rectangle();
        System.out.println("Area of rectangle is:-"+r.length*r.breadth);

    }

    @Override
    public void perimeter(){
        Rectangle r = new Rectangle();
        System.out.println("Perimeter of Rectangle :-" + 2*(r.length+r.breadth));




    }
}

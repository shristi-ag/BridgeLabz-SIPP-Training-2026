package ShapeHirearchy;

public class Triangle extends Shape{

    private int Base;
    private int Height;
    private int side1;
    private int side2;
    private int side3;


    public void setBase(int base){
        this.Base=base;

    }
    public void setHeight(int height){
        this.Height=height;
    }

    public void setSide1(int Side1){
        this.side1=side1;
    }

    public void setSide2(int Side2){
        this.side2=side2;
    }

    public void setSide3(int Side3){
        this.side3=side3;
    }


    @Override
    public  void area(){
        Triangle t = new Triangle();
        System.out.println("Area of Triangle :-"+1/2*(t.Base*t.Height));


    }
    @Override
    public  void perimeter(){
        Triangle t = new Triangle();
        System.out.println("Perimeter of Triangle:-"+(t.side1+t.side2+t.side3) );

    }

}

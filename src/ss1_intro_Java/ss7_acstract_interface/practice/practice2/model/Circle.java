package ss7_acstract_interface.practice.practice2.model;

public class Circle extends  Shape {
    private  double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public  double getPerimeter(){
        return  2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = "
                + getRadius()
                + ", which is subclass of "
                + super.toString();
    }
}
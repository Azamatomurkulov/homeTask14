package triangle;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void areaOfCircle(){
        double area = this.PI * this.radius * this.radius;
        System.out.println("The area of circle: "+ area);
    }

    public void perimeterOfCircle(){
        double per = 2* this.PI * this.radius;
        System.out.println("The perimeter of Circle: "+per);
    }
}

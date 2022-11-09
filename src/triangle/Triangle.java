package triangle;

public class Triangle {
    private double height;
    private double width;
    private int thirdSideOfTriangle;


    public Triangle(){

    }
    public Triangle(int height,int width,int thirdSideOfTriangle){
        this.height = height;
        this.width = width;
        this.thirdSideOfTriangle = thirdSideOfTriangle;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getThirdSideOfTriangle() {
        return thirdSideOfTriangle;
    }

    public void setThirdSideOfTriangle(int thirdSideOfTriangle) {
        this.thirdSideOfTriangle = thirdSideOfTriangle;
    }

    public void areaOfTriangle(){
        double area = this.height * this.width / 2;
        System.out.println("Area of Triangle: "+area);
    }

    public void perimeterOfTriangle(){
        double perimeter = this.height + this.width + thirdSideOfTriangle;
        System.out.println("Perimeter of Triangle: "+perimeter);
    }
}

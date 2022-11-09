package triangle;

public class Rectangle {
    private int height;
    private int width;


    public Rectangle(){

    }
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void areaOfRectangle(){
        int area = this.height * this.width;
        System.out.println("Area of rectangle: "+area);
    }

    public void perimeterOfRectangle(){
        int perimeter = (this.height+this.width)*2;
        System.out.println("Perimeter of rectangle: "+perimeter);
    }
}

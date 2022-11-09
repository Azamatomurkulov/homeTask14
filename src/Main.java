import triangle.Circle;
import triangle.Rectangle;
import triangle.Triangle;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        Counter cn = new Counter(2);
        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println(Counter.getNumOfCalls());
        cn.factorial();

        Counter counter = new Counter(8);
        System.out.println(Counter.getNumOfCalls());
        counter.factorial();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

    }
}

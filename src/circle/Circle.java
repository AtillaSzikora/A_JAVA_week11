/*
1.) Create a java class Circle that contains x, y coordinates of the point where it is located and r which means the radius of it.
Add double member to store the area of the circle named area.
2.) Initialize the coordination in constructor.
3.) Add getter/setter methods for attributes (x,y,r)
4.) Create a method to get back the area of the circle instance. The area is calculated lazily (only when method is called).
The method name should be getArea():double
5.) Make the Circle class to be serizable.
 */

package circle;

import java.io.Serializable;
import static java.lang.Math.PI;

public class Circle implements Serializable {

    int x, y, r;
    double area;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r; }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        area = r * r * PI;
        return area;}

    public static void main(String[] args) {
        Circle circle = new Circle(1, 1, 3);
        System.out.println(circle.getArea());
    }
}

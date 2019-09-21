
package Shape;

public class Circle extends Shape{
    private static final float PI = 3.14f;
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public int getPerimeter() {
        return (int)(2 * radius * PI);
    }
    
    @Override
    public int getArea() {
        return (int)(radius * radius * PI);
    }
    
}

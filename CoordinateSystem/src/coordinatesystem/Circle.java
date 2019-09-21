
package coordinatesystem;


public class Circle extends Shape{
    private static final float PI = 3.14f;
    private int radius;
    private Point center;
    private int area;
    
    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
        this.area = (int)(radius * radius * PI);
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPerimeter() {
        return (int)(radius * 2 * PI);
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public int compare(Shape shape) {
        return this.area - shape.getArea();
    }
    
    
}

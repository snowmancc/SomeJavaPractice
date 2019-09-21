
package coordinatesystem;

public class Rectangle extends Shape{
    
    private Point[] point;
    private int area;
    
    public Rectangle(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }
    
    public Rectangle(Point point1, Point point2) {
        point = new Point[2];
        point[0] = point1;
        point[1] = point2;
        this.area = Math.abs((point[0].getX() - point[1].getX()) * (point[0].getY() - point[1].getY()));
    }

    @Override
    public int getArea() {
        
        return area;
    }

    @Override
    public int getPerimeter() {
        return Math.abs((point[0].getX() - point[1].getX()) + (point[0].getY() - point[1].getY())) * 2;
        
    }

    @Override
    public Point getCenter() {
        int x = (point[0].getX() + point[1].getX()) / 2;
        int y = (point[0].getY() + point[1].getY()) / 2;
        return new Point(x , y);
    }

    @Override
    public int compare(Shape shape) {
        return this.area - shape.getArea();
    }
    
}

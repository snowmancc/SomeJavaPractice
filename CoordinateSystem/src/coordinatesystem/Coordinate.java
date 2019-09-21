
package coordinatesystem;

import java.util.Arrays;

public class Coordinate {
    private Shape[] shapes;
    private int index;
    
    public Coordinate() {
        shapes = new Shape[10];
        index = 0;
    }
    
    public void addShape(Shape shape) {
        if (index == shapes.length) {
            doubleArray();
        }
        
        shapes[index] = shape;
        index += 1;
    }
    
    private void doubleArray() {
        shapes = Arrays.copyOf(shapes, shapes.length * 2);
    }
    
    public int compareArea(int address1, int address2) {
        return shapes[address1].compare(shapes[address2]);
    }
    
    public int getDistance(int address1, int address2) {
        Point center1 = shapes[address1].getCenter();
        Point center2 = shapes[address2].getCenter();
        
        return (int)Math.sqrt((center1.getX() - center2.getX()) ^ 2 + (center1.getY() - center2.getY()) ^ 2);
    }
    
}

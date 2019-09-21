
package Shape;

public class Rectangle extends Shape{
    
    private int high;
    private int width;
    
    public Rectangle(int high, int width) {
        this.high = high;
        this.width = width;
    }
    
    @Override
    public int getPerimeter() {
        return (high + width) * 2;
    }
    
    @Override
    public int getArea() {
        return high * width;
    }

    }
    

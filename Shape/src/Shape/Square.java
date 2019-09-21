
package Shape;

public class Square extends Shape{
    private int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public int getPerimeter() {
        return side * 4;
    }
    
    @Override
    public int getArea() {
        return side * side;
    }
    
}


package ecosystem;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void reviseX(int x) {
        this.x = x;
    }
    
    public void reviseY(int y) {
        this.y = y;
    }
}

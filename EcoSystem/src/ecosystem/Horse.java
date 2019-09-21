
package ecosystem;

public class Horse extends Creature implements BiologicalAction{
    private Point point;
    private boolean canAction;
    
    public Horse(String name, Point point) {
        super(name, 'h', 2, 50);
        this.point = point;
    }
    
    @Override
    public boolean canAction() {
        if(canAction) {
            this.canAction = false;
            return true;
        }
        return this.canAction;
    }
    
    @Override
    public void resetAction() {
        this.canAction =true;
    }

    @Override
    public Point move(Point[] point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean brand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

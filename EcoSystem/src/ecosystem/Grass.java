
package ecosystem;

public class Grass extends Creature implements BiologicalAction{
    private Point point;
    private boolean canAction;
    
    public Grass(String name, Point point) {
        super(name, 'g',  1, 20);
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
        throw new UnsupportedOperationException("Can't  Move."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eat() {
        throw new UnsupportedOperationException("Can't  eat."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean brand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

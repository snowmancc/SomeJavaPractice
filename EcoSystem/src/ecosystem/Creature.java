
package ecosystem;
/*
    所有子類別都屬於Creature 差別只在於類別擁有什麼行為(介面)
*/

public class Creature implements BiologicalAction{
    private int level;
    private int life;
    private char ic;
    private String name;
    
    public Creature() {
        this.level = 0;
        this.life = 10000;
        this.ic = '.';
        this.name = ".";
    }
    
    public Creature(String name, char ic, int level, int life) {
        this.level = level;
        this.life = life;
        this.ic = ic;
        this.name = name;
        
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public int getLife() {
        return this.life;
    }
    
    public char getIc() {
        return this.ic;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void reviseName(String name) {
        this.name = name;
    }
    
    public boolean canAction () {
        return false;
    }
    
    public void resetAction() {
        return;
    }

    @Override
    public Point move(Point[] point) {
        throw new UnsupportedOperationException("Can't Move."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eat() {
        throw new UnsupportedOperationException("Can't  eat."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean brand() {
        throw new UnsupportedOperationException("Can't  brand."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

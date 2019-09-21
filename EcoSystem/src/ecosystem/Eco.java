
package ecosystem;

public class Eco {
    private Creature[][] creatures;
    
    public Eco(Creature[][] creatures) {
        this.creatures = creatures;
    }
    
    public void run() {
        resetAllStatus();
        for(int i = 0; i < creatures.length; i++) {
            for (int j = 0; j < creatures[i].length; j++) {
                if(creatures[i][j].canAction()) {
                    run(creatures[i][j]);
                }
            }
        }
    }
    
    private void resetAllStatus() {
        for(int i = 0; i < creatures.length; i++) {
            for (int j = 0; j < creatures[i].length; j++) {
                creatures[i][j].resetAction();
            }
        }
        
    }
    
    private void run(Creature creature) {
        
    }
}

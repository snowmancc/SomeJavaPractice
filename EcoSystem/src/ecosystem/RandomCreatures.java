
package ecosystem;

public class RandomCreatures {
    
    private Creature[][] creatures;
    
    public RandomCreatures() {
        this(5, 7);
    }
    
    public RandomCreatures(int y, int x) {
        creatures = new Creature[y][x];
    }
    
    public Creature[][] produce() {
        int ranNum;
        int grassCount = 0;
        int horseCount = 0;
        for(int i = 0; i < creatures.length; i++) {
            for(int j = 0; j < creatures[i].length; j++) {
                ranNum = (int)(Math.random() * 15);
                if(ranNum < 3) {
                    creatures[i][j] = new Grass("草" + (++grassCount), new Point(i, j));
                }
                else if (ranNum == 5) {
                    creatures[i][j] = new Horse("草" + (++horseCount), new Point(i, j));
                }
                else {
                    creatures[i][j] = new Creature();
                }
            }
        }
        
        return creatures;
    }
    
}

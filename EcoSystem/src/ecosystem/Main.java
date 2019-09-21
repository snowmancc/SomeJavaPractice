
package ecosystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomCreatures random = new RandomCreatures();
        
        Creature[][] creatures = random.produce();
        
        while(true) {
            
            print(creatures);
            
            scanner.next();
        }
    }
    
    public static void print(Creature[][] creatures) {
        
        for(int i = 0; i < creatures.length; i++) {
            for(int j = 0; j < creatures[i].length ;j++) {
                System.out.print(creatures[i][j].getIc() + " ");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;


public class Uno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GameSystem game = new GameSystem(2);
        
        game.createPlayer("aa", 0);
        game.createPlayer("bb", 1);
        
        game.start();

        
    }
}

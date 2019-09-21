/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batmoneygame;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BatMoneyGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String name1 = "chao";
        String name2 = "lo";  
        Player player1 = new Player(name1,5);
        Player player2 = new Player(name2,5);       
        GameStart game = new GameStart();
        game.setPlayer(player1,player2);
        int round = 10;
        game.start(10);
        
    }
}

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
public class GameStart {
    Cards cards;
    int talBat;
    Player[] player;
    int round;
    
    public GameStart () {
        player = new Player[2];
        talBat = 0;
        round = 0;
        cards = new Cards();
    }
    
    public void setPlayer (Player player1,Player player2) {
        this.player[0] = player1;
        this.player[1] = player2;
    }
    
    private boolean canBat (Player player, int bat) {
        boolean canBat = true;
        if (player.getMoney() < bat) {
            canBat = false;
        }
        return canBat;
    }
    
    public void setBat(int m1, int m2) {
        this.talBat = m1 + m2;
    }
    
    public int getBat() {
        return talBat;
    }
    
    public void takeBat (){
        this.talBat = 0;
    }
    
    private boolean isNoCard (Cards cards) {
        if (cards.getIndex() == 52) {
            return true;
        }
        return false;
    }
    
    private boolean isGameOver(int counter) {
        boolean gameOver = false;
        if (counter > this.round) {
            gameOver = true;
        }
        for (int i = 0; i < player.length; i++) {
            if (player[i].getMoney() == 0) {
                gameOver = true;
            }
        }
        return gameOver;
    }
    
    private int getWin (Card card1, Card card2) {
        if (card1.compare(card2)) {
            return 1;
        }
        return 2;
    }
    
    private int inputMoney (Player player, Scanner scanner) {
        int m = -1;
        
        do {
            System.out.print(player.getName()+"輸入賭注金額:  ");   
            m = scanner.nextInt();
        }while (!canBat(player, m));
        
        return m;
    }
    
    public void start (int round) {
        Scanner scanner = new Scanner(System.in);
        this.round = round;
        int counter = 1;
        Cards stack = new Cards();
        stack.shuffle();
        while (!isGameOver(counter++)) {
            
            
            int m1 = inputMoney(player[0], scanner);
            player[0].bet(m1);
            int m2 = inputMoney(player[1], scanner);
            player[1].bet(m2);
            setBat(m1, m2);
            System.out.println("總賭注:  " + getBat());
            
            Card card1 = stack.deal();
            Card card2 = stack.deal();
            System.out.println(player[0].getName()+"得到:  " + card1 +"  "+ player[1].getName()+ " 得到:  " + card2 );
            
            if (getWin(card1, card2) == 1) {
                System.out.println(player[0].getName()+"獲勝");
                player[0].addMoney(getBat());
                takeBat();
            }
            else {
                System.out.println(player[1].getName()+"獲勝");                
                player[1].addMoney(getBat());
                takeBat();
            }
            
            System.out.println(player[0].getName()+ "剩餘金額" + player[0].getMoney());
            System.out.println(player[1].getName()+ "剩餘金額" + player[1].getMoney());
            
            if (isNoCard(stack) ) {
                stack = new Cards();
                stack.shuffle();
            }
        }
    }    
}

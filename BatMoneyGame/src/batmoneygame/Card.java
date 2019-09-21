/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batmoneygame;

/**
 *
 * @author user
 */
public class Card {
    private String suit;
    private int point;
    public static final String[] suits ={"黑桃", "紅心", "菱形", "梅花"};
    
    public Card (String suit, int point) {
        this.suit = suit;
        this.point = point; 
    }
    
    public String toString() {
        return suit + " " + point;
    }
    
    public void setSuit (String suit) {
        this.suit = suit;
    }
    
    public void setPoint(int num) {
        this.point = num;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public int getPoint() {
        return point;
    }
    
    public boolean compare (Card card) {
        boolean big = true;
        if (point != card.getPoint()) {
            if (point < card.getPoint()) {
                big = false;
            }
        }
        else {
            if (card.getSuit().equals("黑桃")) {
                big = false;
            }
            else if (this.suit.equals("梅花")) {
                big = false;
            }
            else if (suit.equals("菱形") && card.getSuit().equals("紅心")) {
                big = false;
            }
        }
        return big;
    }
    
}

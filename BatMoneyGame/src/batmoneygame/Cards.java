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
public class Cards {
    private Card[] cards;
    private int index;
    private int surplus;

    
    public Cards() {
        cards = new Card[52];
        cards = createCards();
        index = 0;
    }
    
    public int getIndex () {
        return index;
    }
    
    private  Card[] createCards () {
        for (int i = 0; i < 52; i++) {
            int point = (i % 13) + 1;
            String suit = Card.suits[(i / 13) % 4];
            Card card = new Card(suit,point);
            cards[i] = card;
        }
        return cards;
    }
    
    public void shuffle() {
        int ranNum;
        for (int i = 0; i < 52; i++) {
            ranNum = (int)(Math.random() * 52);
            Card tmp =cards[i];
            cards[i] = cards[ranNum];
            cards[ranNum] = tmp;
        }
    }
    
    public Card deal () {
        
        if (index != 52) {
            Card card = cards[index];
            index += 1;
            return card;
        }
        return null;
    }
     
    public String toString() {
        String str = "";
        for (int i = index; i <cards.length - index; i++) {
            str = str + cards[i].toString() + "\n";
        }
        return str;
    }
}


    

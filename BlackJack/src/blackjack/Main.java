
package blackjack;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck(2);
        deck.shuffle();
        
        System.out.println(deck);
    }
    
}

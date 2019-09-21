
package blackjack;

public class Deck {
    
    private Poker[] pokers;
    private int index;
    private int pokerAmount;
    private int deckAmount;
    
    public Deck() {
        this.deckAmount = 1;
        this.pokerAmount = 52 * deckAmount;
        this.pokers = new Poker[this.pokerAmount];
        this.index = 0;
        generateDeck();

    }
    
    public Deck(int deckAmoint) {
        this.deckAmount = deckAmoint;
        this.pokerAmount = 52 * deckAmount;
        this.pokers = new Poker[this.pokerAmount];
        this.index = 0;
        generateDeck();

    }
    
    private void generateDeck () {
        int counter = 0;
        for(int i = 0; i < this.deckAmount; i++) {
            Poker[] aDeck = createPokers();
            for(int j = 0; j < 52; j++) {
                pokers[counter++] = aDeck[j];
            }
        }
    }
    
    private Poker[] createPokers() {
        String[] suits ={Poker.SUIT_SPADE, Poker.SUIT_HEART, Poker.SUIT_DIAMOND, Poker.SUIT_SCLUB};
        Poker[] deck = new Poker[52];  
        for(int i = 0; i < 52; i++) {
            deck[i] = new Poker(((i % 13) + 1), suits[i / 13]);
        }
        return deck;
    }
    
    public void shuffle() {
        for(int i = 0; i < this.pokerAmount; i++) {
            int random = (int)(Math.random() * (pokerAmount - i) + i);
            Poker tmp = pokers[i];
            pokers[i] = pokers[random];
            pokers[random] = tmp;
        }
    }
    
    public Poker deal() {
        return pokers[index++];
    }
    
    public int surplusPokers() {
        return pokerAmount - index;
    }
    
    public boolean havePoker(){
        if(surplusPokers() == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < pokerAmount; i++) {
            str = str + pokers[i] + "\n";
        }
        
        return str;
    }
}


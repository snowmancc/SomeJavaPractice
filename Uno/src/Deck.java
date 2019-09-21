
public class Deck {
    
    private Card[] cards;
    private int cardAmount;
    private int index;

    public Deck() {
        index = 0;
        cardAmount = 76;
    }
    
    public int getLength () {
        return cardAmount - index ;
    }

    public void createDeck () {
        cards = new Card[76];
        int index = 0;
        for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 10; j++) {
               if (j == 0) {
                   cards[index++] = new Card(Card.suits[i],j);
               }
               else {
                   for (int k = 0; k < 2; k++) {
                    cards[index++] = new Card(Card.suits[i],j);
                    }
               }
           }
        }
    }
    
    public void shuffle() {
        int ranNum;
        for (int i = 0; i < cards.length; i++) {
            ranNum = (int)(Math.random() * cards.length);
            Card tmp =cards[i];
            cards[i] = cards[ranNum];
            cards[ranNum] = tmp;
        }
    }
    
    public void afreshEmploy(Card[] discards, int amount) {
        int dLenght = amount - 1;  //會留一張牌在棄牌堆
        this.cards = new Card[dLenght];
        for (int i = 0; i < dLenght; i++) {
            cards[i] = discards[i];
        }
        this.index = 0;
        this.cardAmount = amount;
    }
    
    public Card deal () {
        
        if (!isNoCard()) {
            Card card = cards[index];
            index += 1;
            return card;
        }
        return null;
    }
    
    public boolean isNoCard() {
        if (index == cardAmount) {
            return true;
        }
        else {
            return false;
        }
    }
    
     @Override
    public String toString() {
        String str = "";
        for (int i = index; i <cards.length; i++) {
            str = str + cards[i] + "\n";
        }
        return str;
    }
}


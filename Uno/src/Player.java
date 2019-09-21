
public class Player {

    String name;
    Card[] handCards;
    int index;

    public Player(String name) {
        this.name = name;
        handCards = new Card[10];
        index = 0;
    }
    
    public int length () {
        return index ;
    }
    
    public String getName () {
        return name;
    }

    public void setCard(Card card) {
        handCards[index] = card;
        index += 1;
    }

    public Card getCard(int address) {
        int index = address - 1;
        return handCards[index];
    }

    public Card giveCard(int address) {
        int index = address - 1;
        Card card = handCards[index];
        delCard(index);
        return card;
    }
    
    public String choiceCard (Card target) {
        String str = "";
        for (int i =0; i < index; i++) {
            if (target.checkLink(handCards[i])) {
                str = str + (i + 1) + ": " + handCards[i] + "     ";
            }
        }
        return str;
    }
    
    @Override
    public String toString () {
        String str = "";
        for (int i = 0; i < index; i++) {
            str = str + (i + 1) + ":" + handCards[i] + "    ";
        }
        return str;
    }

    private void delCard(int index) {
        Card[] card = new Card[7];
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            if (index != i) {
                card[counter] = handCards[i];
                counter += 1;
            }
        }
        this.handCards = card;
        this.index -= 1;
    }
    
    public boolean checkHand(Card card) {
        boolean haveCard = false;
        for (int i =0; i < index; i++) {
            if (card.checkLink(handCards[i])) {
                haveCard = true;
            }
        }
        return haveCard;
    }
    
    public boolean checkUno () {
        if (index < 2) {
            return true;
        }
        else {
            return false;
        }
    }

}

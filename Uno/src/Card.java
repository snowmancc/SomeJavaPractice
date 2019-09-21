
public class Card {
    private String suit;
    private int point;
    public static final String[] suits ={"藍色", "黃色", "綠色", "紅色"};
    
    public Card (String suit, int point) {
        this.suit = suit;
        this.point = point;
    }
    
    @Override
    public String toString() {
        return suit + "" + point;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public int getPoint() {
        return point;
    }
    
    public boolean checkLink (Card card) {
        if (this.point == card.point) {
            return true;
        }
        else if (this.suit.equals(card.getSuit())){
            return true;
        }
        else {
            return false;            
        }
    }    
}

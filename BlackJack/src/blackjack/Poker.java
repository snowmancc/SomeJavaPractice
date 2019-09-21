
package blackjack;

public class Poker {
    
    public static final String SUIT_SPADE = "黑桃";
    public static final String SUIT_HEART = "愛心";
    public static final String SUIT_DIAMOND = "方塊";
    public static final String SUIT_SCLUB = "梅花";
    private int point;
    private String suit;
    
    public Poker(int point, String suit) {
        this.point = point;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return suit + point;
    }
    
    public boolean isGreater(Poker poker) {
        boolean greater = true;
        
        if (this.point < poker.point) {
            greater = false;
        }
        else if (this.point == poker.point) {
            if (poker.suit.equals(SUIT_SPADE)) {
                greater = false;
            }
            else if (this.suit.equals(SUIT_SCLUB)) {
                greater = false;
            }
            else if(this.suit.equals(SUIT_DIAMOND) && poker.suit.equals(SUIT_HEART)) {
                greater = false;
            }
        }
        
        return greater;
    }
    
}

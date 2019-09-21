
import java.util.Scanner;


public class GameSystem {
    private Player[] player;
    private int round;
    private int members;
    private Deck deck;
    private Card[] decards;
    private int decardsAround;
    private Card target;
    private boolean isGameover;
    private boolean canGive;
    
    public GameSystem (int members) {
        this.members = members;
        player = new Player[members];
    }
    
    public void createPlayer(String name, int member) {
            player[member] = new Player(name);        
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        deck =new Deck(); //創建牌組類物件
        decards =new Card[76]; //棄牌堆牌最多76張
        decardsAround = 0;        //棄牌堆的張數
        isGameover = false;  //迴圈判斷
        canGive = false; //
        
        deck.createDeck(); //初始化牌組
        deck.shuffle(); //洗牌
        getHand(); //給每位玩家起手牌個7張
        
        Card firstCard = deck.deal(); //翻第一張牌
        decards[decardsAround] = firstCard; //放置棄牌堆
        decardsAround += 1;                
        target = firstCard; //玩家出牌目標

        
        round = 0; //回合數
        
        while (!checkGameover()) { //有玩家沒牌就贏了
            System.out.println("=========================");
            int who = round % members; //判斷換誰
            System.out.println("場面上的牌:" + target);
            System.out.println("換玩家: " + player[who].getName());
            System.out.println(player[who]);
            System.out.println("可以出的牌:  " +player[who].choiceCard(target));
            
            if (player[who].checkHand(target)) {         //有無牌出
                System.out.print("請選擇要出的牌:");
                int address = scanner.nextInt();
                Card giveCard = player[who].giveCard(address);
                decards[decardsAround] = giveCard; //放置棄牌堆
                decardsAround += 1;
                target = giveCard;
            }
            else {      //抽牌
                 checkDeck ();
                Card draw = deck.deal();
                System.out.println("抽到的牌: " + draw);
                if (canGive(draw,target)) { //是否可直接出
                    decards[decardsAround] =draw; //放置棄牌堆
                    decardsAround += 1;
                    target = draw;
                }
                else {
                    player[who].setCard(draw);
                }
            }
            
            System.out.println(player[who].getName());
            System.out.println(player[who]);            
            
            System.out.println("要不要喊UNO   1.要    2.不要");
            int uno = scanner.nextInt();
            
            if ( uno == 1) { //剩兩張要喊
                if (player[who].length() == 2) { //手牌剩兩張沒事                    
                }
                else {  //手牌剩下超過兩張 抽兩張牌
                    checkDeck ();
                    player[who].setCard(deck.deal());
                    checkDeck ();
                    player[who].setCard(deck.deal());
                }
            }
            else if (uno == 2){ 
                if (player[who].length() == 2) { // 沒喊UNO
                    checkDeck ();
                   player[who].setCard(deck.deal());
                   checkDeck ();
                    player[who].setCard(deck.deal());                    
                }
                else { //沒事                    
                }
            }
            System.out.println("牌堆剩下的牌" + deck.getLength() + "  棄牌堆: " + decardsAround);
            round += 1;
        }
    }
    
    private boolean checkGameover () {
        if (player[0].length() == 0 || player[1].length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private void getHand () {
        for(int i = 0; i < members; i++) {
            for(int j = 0; j < 7; j++) {
                Card card = deck.deal();
                player[i].setCard(card);
            }
        }
    }
    
    private boolean canGive(Card card, Card target) {
            if (card.checkLink(target)) {
                return true;
            }
            else {
                return false;
            }
    }
    
    private Card[] leaveOne (Card target) {
        Card[] cards = new Card[76];
        cards[0] = target;
        return cards;
    }
    
    private void checkDeck () {
                if (deck.isNoCard()) {
                    deck.afreshEmploy(decards, decardsAround);
                    decards = leaveOne(target);
                    decardsAround = 1;  
                }        
    }
    

}

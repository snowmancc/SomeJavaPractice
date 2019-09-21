/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShuffleAndDeal2 {

    public static void main(String[] args) {
        int cardStack[] = new int[52];       
        for (int i = 0; i < 52; i++) {
            cardStack[i] = i + 1;
        }
        
        for (int i = 0; i < cardStack.length; i++) {
            int ranNum =(int)(Math.random() * 52 ) + i;  //random*(nax -min + 1) + min => random * (cardNum - i) + i; *
            if (ranNum > 51) {                                                //                                                                因為i會越來越大 最小值會越來越大
                ranNum = 51;
            }
            int tmp = cardStack[i];
            cardStack[i] = cardStack[ranNum];
            cardStack[ranNum] = tmp;
            if ((i + 1) % 13 == 0) {
                System.out.println(cardStack[i]);
            }
            else {
                System.out.print(cardStack[i] + "  ");
            }            
        }        
    }
}

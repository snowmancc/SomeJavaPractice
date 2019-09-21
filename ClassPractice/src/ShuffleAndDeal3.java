/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShuffleAndDeal3 {

    public static void main(String[] args) {
        int cardStack[] = new int[52];       
        for (int i = 0; i < 52; i++) {
            cardStack[i] = i + 1;
        }
        String[] suit ={"黑桃", "紅心", "方塊", "梅花"};
        
        for (int i = 0; i < cardStack.length; i++) {
            int ranNum =(int)(Math.random() * (52 - i )) + i;  //random*(nax -min + 1) + min => random * (cardNum - i) + i; *
            
            int tmp = cardStack[i];
            cardStack[i] = cardStack[ranNum];
            cardStack[ranNum] = tmp;
            
            
            System.out.print(suit[(cardStack[i]-1) /  13] + " ") ;
            System.out.print((cardStack[i] - 1) % 13 + 1 + "  ");
 
            System.out.print(((i + 1) % 13 == 0)?"\n": "  ");               
        }        
    }
}

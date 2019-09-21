/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShuffleAndDeal {

    public static void main(String[] args) {
        int cardStack[] = new int[52];

        for (int i = 0; i < 52; i++) {
            cardStack[i] = i + 1;
        }

        System.out.println((int) (Math.random() * 10 + 4) * 4);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                int raNum1 = (int) (Math.random() * 10 + 1);
                int raNum2 = ((int) (Math.random() * 10 + 4)) * 4;
                int tmp = cardStack[raNum1 - 1];
                cardStack[raNum1 - 1] = cardStack[raNum2 - 1];
                cardStack[raNum2 - 1] = tmp;
            } else {
                int raNum1 = (((int) (Math.random() * 10 + 1)) + 3) * 2;
                int raNum2 = (((int) (Math.random() * 10 + 1)) + 3) * 4;
                int tmp = cardStack[raNum1 - 1];
                cardStack[raNum1 - 1] = cardStack[raNum2 - 1];
                cardStack[raNum2 - 1] = tmp;
            }
        }

        for (int i = 0; i < 52; i++) {
            if ((i + 1) % 13 == 0) {
                System.out.println(cardStack[i]);
            } else {
                System.out.print(cardStack[i] + " ");
            }
        }
    }
}

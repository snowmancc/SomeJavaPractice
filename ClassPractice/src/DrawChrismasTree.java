
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DrawChrismasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = 0;
        do {
            System.out.println("請輸入3以上的奇數");
            side = input.nextInt();
        }while(side % 2 != 1 || side < 3);
        
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < (side - Math.abs((side / 2 - i) * 2) + 1) / 2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < Math.abs(side / 2 - i) * 2 +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

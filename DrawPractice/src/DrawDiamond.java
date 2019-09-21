
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
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high;
        do {
            System.out.println("請輸入基數的邊長");
            high = input.nextInt();
        }while( high % 2 == 0);
        int side = high + 2;
        int divideSide= high / 2 + 1; //3
        int divideRow = (high - 1) / 2; // 2 
        
        for (int i = 0; i < high; i++) {
            if( i <= divideRow) {
                for (int j = 1; j < divideSide- i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i +1; j++) {
                    System.out.print("*");
                }
            }
            else  {
                int ii = i - divideRow; 
                int iii = i - 2 * ii;
               for (int j = 1; j < divideSide- iii; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * iii +1; j++) {
                    System.out.print("*");
                }                
            }
            System.out.println();
        }
    }
}

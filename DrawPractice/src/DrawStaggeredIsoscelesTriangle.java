
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
public class DrawStaggeredIsoscelesTriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int high = input.nextInt();
        
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < high - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}

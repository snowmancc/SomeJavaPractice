
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
public class DrawAirCoreRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int side = input.nextInt();
        
        System.out.println("*");
        
        for (int i = 1; i < side - 1; i++) {
            System.out.print("*");
            for (int j = 2; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            }
        
        for (int i = 0;  i < side; i++) {
            System.out.print("*");
        }
    }
}

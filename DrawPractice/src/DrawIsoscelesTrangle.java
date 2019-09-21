
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
public class DrawIsoscelesTrangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < ((2 * side + 1) - (2 * i + 1)) / 2 ; j++) {   //2*side + 1 是最大邊的長  2*i+1是每一列的長度 相減就是空白數
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1;  j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

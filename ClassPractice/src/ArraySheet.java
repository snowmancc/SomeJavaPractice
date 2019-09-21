
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
public class ArraySheet {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         
        System.out.println("請輸入被乘數和乘數");
        int num = input.nextInt();
        int num1 = input.nextInt();
        int sheet[][] = new int [99][99];

        for (int i = 0; i < sheet.length; i++) {
            for (int j = 0; j < sheet[i].length; j++) {
                sheet[i][j] = (i + 1) *( j + 1);
            }
        }
        System.out.println( num + "*" + num1 + "=" + sheet[num - 1][num1 - 1]);
        }
}    



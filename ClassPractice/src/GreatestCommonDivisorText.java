
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
public class GreatestCommonDivisorText {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("請輸入兩個數字");
        
        int num = input.nextInt();
        int num1 = input.nextInt();
        int tmp = 0;
        int outnum = num;
        int outnum1 = num1;
        
        while (num != 0) {
           if ( num < num1) {
               tmp = num;
               num = num1;
               num1 = tmp;
           }
           num = num % num1;
          
        }
        System.out.println(outnum + "和" + outnum1 + "最大公因數是:" + num1);
    }
}


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
public class OneAddToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入一個整數");
        int num = input.nextInt();
        
        int i = 0;
        int sum = 0;
        while (i < num) {
            i++;
            sum += i;
        }
        
        System.out.println((sum));
    }
}

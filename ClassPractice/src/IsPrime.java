
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
public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個整數");
        int num = input.nextInt();
        int factor = 0;
        int divisor = num;
        
        while (divisor > 0){
            if (num % divisor == 0){
                factor++;
            }
            divisor--;
        }
        
        System.out.println(num + ((factor == 2)?"是":"不是") + "質數");  //三元運算子
        
        }
    }

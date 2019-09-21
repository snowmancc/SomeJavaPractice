
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
public class IsPrimeUseSqrt {
    
    //質數不能整除 2 ~ 根號  n - 1 的數字
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個整數");
        int num = input.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i < Math.sqrt(num) ; i++ ) {    //Math數學工具
            if (num % i == 0) {
                isPrime = false;
                break;   //不用重複判斷
            }
        }
       
        
        System.out.println(num + (( isPrime)?"是":"不是") + "質數");  //三元運算子
        
        }
    }

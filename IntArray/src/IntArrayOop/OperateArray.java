/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntArrayOop;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperateArray {
    
    public static void start () {
        
        Scanner scanner = new Scanner(System.in);
        IntArray arr = new IntArray();
        boolean continueOp = true;
        while (continueOp) {
            System.out.println("請輸入要執行的功能  1. 增加數字  2.查詢數字 3.查詢長度 4.刪除數字 5.顯示陣列  6.離開");
            int option = scanner.nextInt();
            int num;
            if (option == 1) {
                num = scanner.nextInt();
                arr.add(num);
            }
            if (option == 2) {
                num = scanner.nextInt();
                System.out.println(arr.get(num));
            }
            if (option == 3) {
                System.out.println(arr.length());
            }
            if (option == 4) {
                num = scanner.nextInt();
                System.out.println(arr.remove(num));
            }
            if (option == 5) {
                System.out.println(arr.toString());
            }
            if (option == 6) {
                continueOp = false;
            }
        }
    }
}

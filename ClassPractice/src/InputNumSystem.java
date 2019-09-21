
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
public class InputNumSystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int array[] = new int[2];
        int arrCounter = 0;
         do {
            do {
                System.out.print("請輸入正整數: ");
                input = scanner.nextInt();
                System.out.println();               
            }while ( input < -1);
            
            if (input == -1){
                break;
            }
            if (arrCounter == array.length) {
                int tmp[] = new int[array.length * 2];
                for (int j = 0; j < array.length; j++) {
                    tmp[j] = array[j];
                }
                array = tmp;
            }
            array[arrCounter++] = input;           
        }while(true);
         
         int max = array[0];
         int min = array[0];
         int maxAdr = 1;
         int minAdr =  1;
         for (int i = 1; i < arrCounter; i++) {
             if (array[i] > max) {
                 int tmp = max;
                 max = array[i];                 
                 maxAdr = i + 1;
             }
             if (array[i] < min) {
                int tmp = min;
                min = array[i];                 
                minAdr = i + 1;
            }
         }
         System.out.println("最大值: " + max + "位置: " + maxAdr);
         System.out.println("最小值: " + min + "位置: " + minAdr);
         int num = 0;
         input = 0;
         do {
             System.out.println("請選擇要執行的功能 1.找數字 2.以小排到到顯示 3.離開程式");
              input = scanner.nextInt();
              switch (input) {
                  case 1:
                      System.out.println("輸入一個數字");
                      num = scanner.nextInt();
                      for (int i = 0; i < array.length; i++) {
                          if (num == array[i]) {
                              System.out.println("數字" + num + "在第" + (i + 1) +"個" );
                              break;
                          }
                          if (i == array.length - 1) {
                              System.out.println("-1");
                          }
                      }
                      break;
                  case 2:
                      for (int i = 0; i < array.length - 1; i++) {
                          for(int j = 0; j < array.length - i - 1; j++) {
                              if(array[j] > array[j + 1]) {
                                  int tmp = array[j];
                                  array[j] = array[j + 1];
                                  array[ j + 1] = tmp;
                              }                                 
                          }
                      }
                      for (int i = 0; i < array.length; i++) {
                          System.out.println(array[i]);
                      }
                      break;
                  case 3:
                      break;
              }
         }while(input != 3);
    }
 }

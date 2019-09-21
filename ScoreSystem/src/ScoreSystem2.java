
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
public class ScoreSystem2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int scores[] = new int[2];
        int studentNum = 0;
        int num = 0;
        int counter = 0;
        do {
            System.out.println("請輸入要使用的功能 1.輸入成績 2.顯示成績 3.離開程式");
            input = scanner.nextInt();
            if (input == 1) {
               do {                  
                    do {
                        System.out.println("請輸入 0 ~ 100分");
                        System.out.print("第" + (counter + 1) + "位學生的成績:");
                        num = scanner.nextInt();
                        System.out.println();
                    }while(num < -1 || num > 100);
                    
                    if (num !=-1 ) {
                        if (counter == scores.length ) {
                            int newArray[] = new int[scores.length * 2];
                            for (int i = 0; i < scores.length; i++) {
                                newArray[i] = scores[i];
                            }
                            scores = newArray;
                        }                       
                        scores[counter++] = num;                   
                    }
                }while(num != -1);
            }
                    
            if (input == 2) {
                for (int i = 0; i < counter; i++) {
                    System.out.println("第" + (i + 1) + "位學生的成績:" + scores[i]);
                }
            }
        }while( input != 3);
    }
}

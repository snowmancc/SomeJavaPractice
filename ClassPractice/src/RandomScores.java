
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
public class RandomScores {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入要產生幾個人數");
        int num = scanner.nextInt();
        
        int scores[][] = new int[num][5]; //第五個放總分
        for(int i = 0; i < num; i++) {
            scores[i][0] = i + 1;
            scores[i][1] = (int)(Math.random() * 61 + 40);  //(0~60) + 40  => random*(max-min+1) + min
            scores[i][2] = (int)(Math.random() * 61 + 40);
            scores[i][3] = (int)(Math.random() * 61 + 40);
            scores[i][4] = scores[i][1] + scores[i][2] + scores[i][3];
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("座號:  "+ scores[i][0] + "  總分:  " + scores[i][4] +"(" + scores[i][1] + "/" + scores[i][2] + "/" + scores[i][3] + ")");
        }
        System.out.println("========================");
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if ( scores[j][4] < scores[j + 1][4] ) {
                    int tmp[] = scores[j];
                    scores[j] = scores[ j + 1];
                    scores[j + 1] = tmp;
                }
            }
        }
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println("座號:  "+ scores[i][0] + "  總分:  " + scores[i][4] +"(" + scores[i][1] + "/" + scores[i][2] + "/" + scores[i][3] + ")" + "  名次: " + (i + 1));
        }
        
    }
}

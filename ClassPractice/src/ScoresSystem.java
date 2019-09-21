
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
public class ScoresSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int scores[][] = new int[2][];
        int counter = 0;
        
        do{
            System.out.println("請輸入第" +(counter + 1) + "位學生的成績:");
            do {
                System.out.print("請輸入國文成績: ");
                input = scanner.nextInt();
            }while(input < -1 || input > 100);
            System.out.println();
            
            if(input == -1) {
                break;                        
            }
            
            if (counter ==scores.length) {
                int tmp[][] = new int [scores.length * 2][];
                for ( int i = 0; i < scores.length; i++) {
                    tmp[i] = scores[i];
                }
                scores = tmp;
            }
            scores[counter] = new int[3];
            scores[counter][0] = counter + 1;
            scores[counter][1] = input;
            
            do {
                System.out.print("請輸入英文成績: ");
                input = scanner.nextInt();
            }while(input < 0 || input > 100);
            System.out.println();
            scores[counter++][2] = input;
            
        }while(true);
        
        for (int i = 0; i < counter; i++) {
            System.out.println( scores[i][0] + "  " + scores[i][1] + " "  + scores[i][2]);
        }
        
        
        input = 0;
        
        do {
            System.out.println("請輸入要執行的功能 1.依照總分排名(同分同名) 2.依照座號排列");
            input = scanner.nextInt();
            switch (input){
                case 1:
                    int rank[][] = scores;
                    for (int i = 0; i < counter - 1; i++) {
                        for (int j = 0; j < counter - i - 1; j++) {
                            if ((rank[j][1]+ rank[j][2]) < rank[j + 1][1] +  rank[j + 1][2]) {
                                int tmp[] = rank[j];
                                rank[j] = rank[j + 1];
                                rank[j + 1] = tmp;
                            }
                        }                       
                    }
                    int ranki = 1;
                    System.out.println("總分: " + (rank[0][1]+ rank[0][2]) + " 名次: " + ranki);
                    
                    for (int i = 1; i < counter; i++) {
                        if (rank[i - 1][1]+ rank[i -1][2] == rank[i][1]+ rank[i][2]){
                            System.out.println("總分: " + (rank[i][1]+ rank[i][2]) + " 名次: " + ranki);
                        }
                        else {
                            System.out.println("總分: " + (rank[i][1]+ rank[i][2]) + " 名次: " + ++ranki);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < counter; i++) {
                        System.out.println("座號: " + scores[i][0] +  " 國文: " + scores[i][1] + " 英文: " + scores[i][2]);
                    }
                    break;
                case 3:
                    break;
            }
        }while( input != 3);
    }
}

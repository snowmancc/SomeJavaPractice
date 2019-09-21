
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
public class ScoreSystem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum;
        int scores[][] = new int[0][4];
        int input = 0;
        int engNum = 0;
        int mathNum = 0;
        int chiNum = 0;
        int rank[][] = new int[0][0];
        int studentId[] = new int [0];
        while (input != 4) {
            System.out.println("請輸入要執行的功能 1.輸入學生成績(成績分別為 英文 數學 國文) 2. 顯示學生成績 (顯示平均) 3.顯示排名 4.離開程式");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("請輸入學生人數");
                    studentNum = scanner.nextInt();
                    scores = new int [studentNum][4];
                    
                    for (int i = 0; i < scores.length; i++) {
                        for (int j = 0; j < 1; j++) {
                            System.out.print("第" + (i + 1) + "位學生的英文成績:");
                            do {
                                engNum = scanner.nextInt();
                            }while(engNum < 0 || engNum >100);
                            System.out.println();
                            System.out.print("第" + (i + 1) + "位學生的數學成績:");
                            do {
                                mathNum = scanner.nextInt();
                            }while(mathNum < 0 || mathNum >100);
                            System.out.println();
                            System.out.print("第" + (i + 1) + "位學生的國文成績:");
                            do {
                                chiNum = scanner.nextInt();
                            }while(chiNum < 0 || chiNum >100);
                            System.out.println();
                        }
                        
                        scores[i][0] = engNum;
                        scores[i][1] = mathNum;
                        scores[i][2] = chiNum;
                        scores[i][3] = (engNum + mathNum +chiNum) / 3;    
                        
                    }
                    break;
                case 2:
                    System.out.println("學生      \t英文\t數學\t國文\t平均");
                    for (int i = 0; i < scores.length; i++) {   
                        System.out.print("第" + (i + 1) +"位學生的成績: ");
                        for ( int j = 0; j < 4; j++) {
                            System.out.print(scores[i][j] + "\t");
                        }
                        System.out.println();
                        
                    }
                    break;
                case 3:
                    studentId = new int[scores.length];
                    for (int i = 0; i < scores.length; i++) {
                        studentId[i] =  i + 1;
                    }
                    rank = new int[scores.length][1];
                    for ( int i = 0; i < scores.length; i++) {
                        rank[i][0] = scores[i][3];
                    }
                    
                    System.out.println("平均排名");
                    for (int i = 0; i < rank.length - 1; i++) {
                        for (int j = 0; j < rank.length - i -1; j++) {
                            if ( rank[j][0] < rank[j + 1][0]) {
                                int tmp = rank[j][0];
                                rank[ j ][0] = rank[j + 1][0];
                                rank[ j + 1][0] = tmp;
                                
                                int tmpId = studentId[j];
                                studentId[ j ] = studentId[ j + 1];
                                studentId[ j + 1] = tmpId;                               
                            }
                        }
                    }
                    for (int i = 0; i < rank.length; i++) {
                        System.out.println( "座號"+ studentId[i] + " " + rank[i][0]);
                    }
                    break;
                case 4:
                    break;           
            }
        }
    } 
}

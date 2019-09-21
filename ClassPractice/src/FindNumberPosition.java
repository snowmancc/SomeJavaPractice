
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
public class FindNumberPosition {
    
    /*
    不用用到排序 直接抓第一個數字比對每個數就好
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請問要輸入幾個數字: ");
        int num = scanner.nextInt();
        System.out.println();
        int inputNum = 0;
        int numScores[] = new int[num];
        int numPosition[] = new int [num];
        
        for (int i = 0; i < num; i++) {            
            do{
                System.out.print("請輸入第"+ (i + 1)+"個正整數: ");
                inputNum = scanner.nextInt();
                System.out.println();
            }while(inputNum< 0);     
            numScores[i] =  inputNum;
            numPosition[i] = i + 1;           
        }
        
        for (int i = 0; i < numScores.length - 1; i++) {
            for (int j = 0; j < numScores.length - i -1; j++) {
                if (numScores[j] < numScores[j + 1] && numScores[j] != numScores[j + 1]){
                    int tmp = numScores[j];
                    numScores[j] = numScores[j + 1];
                    numScores[j + 1] = tmp;
                    
                    int tmpPo = numPosition[ j];
                    numPosition[ j] = numPosition[j + 1];
                    numPosition[ j + 1] =tmpPo;
                }
            }
        }
        
        System.out.println( "最小數值的位置在:" + numPosition[numPosition.length - 1] + "  值:" + numScores[numScores.length - 1]);
        System.out.println( "最大數值的位置在:" + numPosition[0] + "  值:" + numScores[0]);
    }
}

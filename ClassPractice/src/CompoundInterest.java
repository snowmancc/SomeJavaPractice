
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
public class CompoundInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入 本金 利率 存入年分 取回年分");
        
        double capital = input.nextInt();
        double rate = input.nextDouble() / 100;
        int firstYear = input.nextInt();
        int lastYear = input.nextInt();
        
        int year = lastYear - firstYear;
        
       for (int i = 0; i < year; i++) {
            capital *= (1 + rate);
        }
       
       //System.out.println(capital * Math.pow((1+rate), year));
       System.out.println(capital);
    }
}

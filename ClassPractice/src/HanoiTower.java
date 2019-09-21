
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
public class HanoiTower {
    
    public static void getResult (int n , char a, char b, char c) {
        
        
        if (n == 1) {
            System.out.println(a  + "->" + c);
        }
        else {
            getResult(n-1,a,c,b);
            getResult(1,a,b,c);
            getResult(n-1,b,a,c);
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char a = 'a';
        char b = 'b';
        char c = 'c';
        getResult(n,a,b,c);
        
        
    }
}

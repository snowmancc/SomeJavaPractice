
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
public class DrawAirCodeDiamond {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int side = input.nextInt();
        
        for (int i = 0; i < side; i++) {
            for(int j = 0; j < Math.abs(side / 2 - i); j ++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < side - 2 * Math.abs(side / 2  -i); j++) {
                System.out.print(((j == 0 || j == (side - 2 * Math.abs(side / 2  -i) - 1))?"*":" "));
            }
            
            System.out.println();
            }
            
            }
           
    }


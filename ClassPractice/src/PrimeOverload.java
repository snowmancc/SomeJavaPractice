
import java.util.Arrays;
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
public class PrimeOverload {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num-1; i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean[] isPrime(int[] array, int index) {
        boolean[] boArray = new boolean[index];
        for (int i = 0; i < index; i++) {
            if (isPrime(array[i])) {
                boArray[i] = true;
            }
            else {
                boArray[i] = false;
            }
        }
        return boArray;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        int input = 0;
        while (input !=4) {
            System.out.println("請輸入要執行的功能  1.輸入一個數字  2.一直輸入 停止輸入-1 3.印出之前的行動 4.結束");
            input = scanner.nextInt();
            
            switch (input) {
                case 1:
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + "是質數");
                        string = string + num + "是質數" + "," ;
                    }
                    else {
                        System.out.println(num + "不是質數");
                        string = string + num + "不是質數" + "," ;
                    }
                    break;
                case 2:
                    num = -2;
                    int[] array = new int[2];
                    int index = 0;
                    String str2 = " ";
                    while (num != -1) {
                        num = scanner.nextInt();
                        if (index == array.length) {
                            array = Arrays.copyOf(array,array.length * 2);
                        }
                        if (num != -1 ) {
                            array[index] = num;
                            index += 1;
                        }
                    }
                    boolean[] bo = isPrime(array,index);
                    for (int i = 0; i < index; i++) {
                        if (bo[i]) {
                            string = string + array[i] + " " ;
                            str2 = str2 + array[i] + " " ;
                        }
                        if (i == index - 1) {
                            string = string + "是質數" + " ";
                            str2 = str2 + " 是質數" ;
                        }
                    }
                    for (int i = 0; i < index; i++) {
                        if (!bo[i]) {
                            string = string + array[i] + " " ;
                            str2 = str2 + array[i] + " " ;
                        }
                        if (i == index - 1 ) {
                            string = string + "不是質數" + ",";
                            str2 = str2  + " 不是質數" ;
                        }
                    }
                    System.out.println(str2);
                    break;
                case 3:
                    String[] str =string.split(",");
                    for (int i = 0; i < str.length; i++) {
                        System.out.println(str[i]);
                    }
                    break;
            }
        }
    }
}

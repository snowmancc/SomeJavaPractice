
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
public class BubbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = {49, 12, 38, 65, 74, 20, 13, 5, 0, 46, 80, 56, 77, 16, 2, 9, 1};
        int counter = 0;
        for (int ii = 0; ii < array.length - 1; ii++) { //每一個數字都要和另外所有的數字比較 所以要執行length -1
            for (int i = 0; i < array.length - 1 - ii; i++) { //每比完一個最大的數字就可以少比對一次 所以-ii
                if (array[i] > array[i + 1]) {
                    int m = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = m;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

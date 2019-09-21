/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BinarySearchRe {
    public static int bianarySearch(int [] array, int left, int right,int key) {
        
       int middle = (left + right) / 2;
       if (array[middle] == key) {
          return middle;
       }
        if (left <= right) {
            if (array[middle] > key) {
                middle = bianarySearch(array,left,middle - 1,key);
            }
            else if(array[middle] < key) {
                middle = bianarySearch(array, middle + 1, right,key);
            }
        }
        else{
            return -1;
        }
       return middle;
    }
    
    public static void main (String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 12, 15, 20, 33};
        int key = 15;
        
        System.out.println(bianarySearch(array,0,array.length,key));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntArrayOop;

/**
 *
 * @author user
 */
public class IntArray {
    private int [] arr;
    private int index;
    
    public IntArray () {
        this.arr = new int [2];
        this.index = 0;
    }
    
    public int length() {
        return index;
    }
    
    public void add(int num) {
        if (index == arr.length) {
            doubleArray();
        }
        arr[index] = num;
        index += 1;
    }
    
    public int get(int index) {
        
        if (index < 0 || index >= this.index) {
            return -1;
        }
        return this.arr[index];
    }
    
    public boolean remove (int index) {
        
        if (index < 0 || index >= this.index) {
            return false;
        }
        for (int i = index; i < this.index - index; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.index -= 1;
        return true; 
    }
    
    public String toString () {
        String str = " ";
        for (int i = 0; i < this.index; i++) {
            str = str + arr[i] + " ";
        }
        return str;
    }
    
    private void doubleArray () {
        int [] tmp = new int[this.arr.length * 2];
        for (int i = 0; i < index; i++) {
            tmp[i] = arr[i];
        }
        this.arr = tmp;
    }
     
}

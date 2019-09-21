
package datastructure;

import arraylist.ArrayList;
import static foreach.ForEach.forEach;
import foreach.PrintList;
import linkedlist.LinkedList;
import foreach.ForEachMethod;

public class Main {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        ArrayList list2 = new ArrayList();
        
        for(int i = 0; i < 10; i++) {
            list1.add((i + 2) * 3);
            list2.add((i + 1) * 2);
        }
        
        ForEachMethod method = new PrintList();
        
        forEach(list1, method);
        System.out.println();
        forEach(list2,method);
        System.out.println();
        
        /*for(int i : a) {
            System.out.println(i);
        }*/
        
        System.out.println();
    }
    
}

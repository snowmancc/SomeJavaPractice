
package bubblesortinstance;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortInstance {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        int num;
        while((num = scanner.nextInt()) != 0) {
        a.add(num);
        }
        
        printList(a);
        
        sort(a, new CompareSmallToBig());
        printList(a);
        
        sort(a, new CompareBigToSmall());
        printList(a);
        
        
        
    }
    
    public static void sort(ArrayList list, CompareInterface compare) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = 0; j < list.size() - i - 1; j++) {
                if (compare.compare((int)list.get(j), (int)list.get(j + 1))) {
                    swap(list, j, j + 1);
                }
            }
        }
    }
    
    public static void swap (ArrayList list, int a1, int a2) {
        int tmp = (int)list.get(a1);
        list.set(a1, list.get(a2));
        list.set(a2, tmp);
    }
    
    public static void printList(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        
    }
    
}

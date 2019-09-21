
package scoreinputinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入人數");
        int member = scanner.nextInt();
        Student[] students = new Student[member];
        
        for(int i= 0; i < member; i++) {
           System.out.println("請輸入學生座號: ");
            int address = scanner.nextInt();
           System.out.println("請輸入學生成績: ");
            int score = scanner.nextInt();
            students[i] = new Student(address, score);
        }
        
        int op;
        System.out.println("請選擇功能 1.排序 2.打亂 3.離開");
        
        while((op = scanner.nextInt()) != 3) {
            
            if(op == 1) {
                sort(students, choiceCompare(scanner), choiceOrder(scanner));
                print(students);
            }
            else if(op == 2) {
                int ranNum = (int)(Math.random());
                for(int i = 0; i < students.length; i++) {
                    ranNum = (int)(Math.random() * (students.length - i) + i);
                    Student tmp = students[i];
                    students[i] = students[ranNum];
                    students[ranNum] = tmp;
                }
                    print(students);
            }
            System.out.println("請選擇功能 1.排序 2.打亂 3.離開");
        }
        
    }
    
    public static void swap(Student[] students, int a1, int a2) {
        Student tmp = students[a1];
        students[a1] = students[a2];
        students[a2] = tmp;
    }
    
    public static SortOrderInterface choiceOrder(Scanner scanner) {
            System.out.println("請輸入要排序方式  1.大到小  2.小到大");
            int choice = scanner.nextInt();
            if (choice == 1) {
                return new SortBigToSmall();
            }
            else if (choice == 2) {
                return new SortSmallToBig();
            }
            return null;
    }
    
    public static void sort(Student[] students,CompareInterface compare, SortOrderInterface order) {
        for(int i = 0; i < students.length - 1; i++) {
            for(int  j = 0; j < students.length - i - 1; j++){
                if(compare.compare(students[j], students[j + 1], order)) {
                    swap(students, j, j + 1);
                }
            }
        }
    }
    
    public static void print(Student[] students) {
        for(int i = 0; i < students.length; i ++) {
            System.out.println(students[i]);
        }
    }
    
    public static CompareInterface choiceCompare(Scanner scanner) {
            System.out.println("請輸入要排序依據 1.座號  2.成績");
            int choice = scanner.nextInt();
            if (choice == 1) {
                return new CompareAddress();
            }
            else if (choice == 2) {
                return new CompareScore();
            }
            return null;
        
    }
    
}

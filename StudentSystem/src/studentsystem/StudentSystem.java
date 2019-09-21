/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        boolean continueFunction = true;
        while (continueFunction) {
            System.out.println("1.新增學生資料 2.新增成績 3.輸出檔案 4.成績排名 5.按照座號輸出 6.離開");
            int option = scanner.nextInt();
            int address;
            String name;
            int score;
            switch (option) {
                case 1:
                    System.out.println("請輸入座號");
                    address = scanner.nextInt();
                    scanner.nextLine(); //消除 \n 不會跳下一行
                    System.out.println("請輸入姓名");
                    name = scanner.nextLine();
                    students.addStudent(address, name);
                    break;
                case 2:
                    System.out.println("請輸入學生座號 ");
                    address = scanner.nextInt();
                    System.out.println("請輸入成績");
                    score = scanner.nextInt();
                    students.setScore(address, score);
                    break;
                case 3:
                    System.out.println("姓名   座號      成績");
                    System.out.println(students.toString());
                    break;
                case 4:
                    students.sortScore();
                    System.out.println("姓名   座號       成績");
                    System.out.println(students.toString());
                    break;
                case 5:
                    students.sortAddress();
                    System.out.println("姓名    座號       成績");
                    System.out.println(students.toString());
                    break;
                case 6:
                    continueFunction = false;
                    break;
            }

        }
    }

}

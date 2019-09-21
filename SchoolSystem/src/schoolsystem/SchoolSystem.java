
package schoolsystem;

import java.util.Scanner;

public class SchoolSystem {
    Classes[] school;
    int index;
    
    public SchoolSystem() {
        school = new Classes[10];
        index = 0;
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);       
        while(true) {
            System.out.println("============================");
            System.out.println("請選擇要執行的功能:   1.新增班級    2.新增學生    3.新增學生成績  4.查詢名子   5.全校班級資料  6.搜尋成績");
            int operate = scanner.nextInt();
            
            switch (operate) {
                case 1:
                    createClass(scanner);
                    break;
                case 2:
                    createStudent(scanner);
                    break;
                case 3:
                    inputScore(scanner);
                    break;
                case 4:
                    searchName(scanner);
                    break;
                case 5:
                    toString(scanner);
                    break;
                case 6:
                    searchScore(scanner);
                    break;
            }
        }        
    }
    
    public void createClass(Scanner scanner) {
        System.out.println("請輸入年級");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("請輸入班級");
        String className = scanner.nextLine();        
        school[index] = new Classes(age,className);
        System.out.println("請輸入老師名子");
        String teacher = scanner.nextLine();        
        school[index].setTeacher(teacher);
        this.index += 1;
    }

    public void createStudent(Scanner scanner) {
        scanner.nextLine();   
        System.out.println("請輸入學生姓名");
        String studentName = scanner.nextLine();   
        System.out.println("請輸入學生年級"); 
        int age = scanner.nextInt();
        
        for (int i = 0; i < this.index; i++) {
            if (age == school[i].getAge()) {
                if (school[i].canAdd()) {
                    school[i].setStudent(studentName);
                    System.out.println("新增成功");
                    return;
                }
                else{
                    System.out.println(school[i].getAge() + "年 " +school[i].getName()  + "班人數已額滿");
                }
            }
        }
        System.out.println("無法新增 請先創建班級");
    }    
    
    public void inputScore(Scanner scanner) {
        scanner.nextLine();
        System.out.println("請輸入學生年級");    
        int age = scanner.nextInt();           
        
        scanner.nextLine();
        System.out.println("請輸入學生班級");
        String studentClass = scanner.nextLine();
                
        System.out.println("請輸入學生座號");    
        int address = scanner.nextInt(); 
        
        for (int i = 0; i < this.index; i++) {
            if(haveClass(i, age, studentClass)) {
                if (school[i].canAdd()) {
                    System.out.println("請輸入學生成績");    
                    int score = scanner.nextInt(); 
                    school[i].setScore(address, score);
                    System.out.println("輸入成功");   
                    return;
                }
                else {
                    System.out.println("班級不存在"); 
                    return;
                }
            }
        }
        System.out.println("班級不存在"); 
    }

    public void searchName(Scanner scanner) {
        String str = "";
        scanner.nextLine();
        String name = scanner.nextLine();
        for(int i = 0; i < this.index; i++) {
            str = str +school[i].searchName(name);
        }
        System.out.println(str);
    }

    public void toString(Scanner scanner) {
        String str = "";
        for(int i = 0; i < this.index; i++) {
            str = str +school[i];
        }
        System.out.println(str);
    }

    public void searchScore(Scanner scanner) {
        String str = "";
        int min = scanner.nextInt();
        int mix = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            if (school[i].searchScore(min, mix) != null) {
                str = str + school[i].searchScore(min, mix);
            }
        }
        System.out.println(str);
    }
    
    private boolean haveClass(int index, int age, String name) {
        if (age == school[index].getAge() && name.equals(school[index].getName())) {
            return true;
        }
        return false;        
    }

}

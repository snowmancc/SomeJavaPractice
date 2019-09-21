
package bookcabinet;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Cabinet[] library;
    private int index;
    private int cabinetAddress;
    private int bookAddress;
    
    public Library() {
        library = new Cabinet[10];
        index = 0;
        cabinetAddress = 1;
        bookAddress = 1;
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
        System.out.println
        ("請輸入要執行的功能 1.新增書櫃 2.新增一本書 3.新增書的詳細資料 4.找書 5.印出所有書 6.找分類");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    createCabint(scanner);
                    break;
                case 2:
                    createBook(scanner);
                    break;
                case 3:
                    addBookData(scanner);
                    break;
                case 4:
                    findBook(scanner);
                    break;
                case 5:
                    printTotal(scanner);
                    break;
                case 6:
                    findCabint(scanner);
                    break;
                }  
        }
    }
    
    private int giveCabinetAddress() {
        return this.cabinetAddress++;
    }
    
    private int giveBookAddress() {
        int address =  this.bookAddress;
        this.bookAddress += 1;
        return address;
    }
    
    public void createCabint(Scanner scanner) {
        if (index == library.length) {
            library = Arrays.copyOf(library, library.length * 2);
        }
        System.out.println("請輸入書櫃的分類");
        scanner.nextLine();
        String style = scanner.nextLine();
        library[index++] = new Cabinet(giveCabinetAddress(),style);
        System.out.println("新增完成");
    }
    
    public void createBook(Scanner scanner) {
            System.out.println("要放入什麼類別的書櫃?");
            scanner.nextLine();
            String inputStyle = scanner.nextLine();
            System.out.println("請輸入書名");
            String bookName = scanner.nextLine();
            for (int i = 0; i < index; i++) {
                if(library[i].getStyle().equals(inputStyle)){
                    if (library[i].canAdd()) {
                        library[i].setBook(giveBookAddress(), bookName);
                        System.out.println("新增完成");
                        return;
                    }
                }
            }
            System.out.println("新增失敗");
    }
    
    public void addBookData(Scanner scanner) {
        System.out.println("請輸入要找的書的號碼");
        int address = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            if (library[i].findBook(address) != -1) {
                int[] data = new int[2];
                data = inputData(scanner);
                library[i].getBook(library[i].findBook(address)).setAge(data[0]);
                library[i].getBook(library[i].findBook(address)).setMonth(data[1]);
                System.out.println("輸入成功");
                return;
            }
        }
            System.out.println("沒有這本書");
    }
    
    public void findBook(Scanner scanner){
        System.out.println("請輸入要找的書名");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < index; i++) {
            int finBookAddress = library[i].findBook(name);
            if ( finBookAddress != -1) {
                System.out.println("書櫃編號: "+ library[i].getCabinetAddress() + " "+library[i].getBook(finBookAddress));
                return;
            }
        }
            System.out.println("沒有這本書");
    }
    
    public void printTotal(Scanner scanner) {
        for(int i = 0; i < index; i++) {
           System.out.println("分類:" + library[i].getStyle() + " "+ library[i]);
        }
    }
    
    public void findCabint(Scanner scanner) {
        System.out.println("請輸入分類");
        scanner.nextLine();
        String style = scanner.nextLine();
        String str = "";
        for(int i = 0; i < index; i++) {
            if(library[i].getStyle().equals(style)) {
                if (library[i].getIndex() > 0) {
                    str = str +library[i].getCabinetAddress() + "\n" + library[i];
                }
            }
        }
        System.out.println(str);
    }
    
    private int[] inputData(Scanner scanner) {
        int age, month;
        int[] data = new int[2];
            while(true) {
                System.out.println("請新增書的年份 範圍 1970 ~ 3000");
                age = scanner.nextInt();
                System.out.println("請新增書的月份 範圍 1 ~ 12");
                month = scanner.nextInt();
                
                if (age >= 1970 && age <= 3000) {
                    if (month > 0 && month < 13) {
                        data[0] = age;
                        data[1] = month;
                        return data;
                    }
                }
            }
        
    }
    
    
}


package coordinatesystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Coordinate coordinate = new Coordinate();
        
        System.out.println("請選擇功能 1.新增圖型 2.比較兩圖型的面積 3.找兩圖型中心點的距離 4.離開程式 ");
        int op;
        while((op = scanner.nextInt()) != 4) {
            
            if (op == 1) {
                System.out.println("請選擇要輸入的圖型 1.圓型  2.長方形");
                int choice = scanner.nextInt();
                if(choice == 1) {
                System.out.println("請輸入圓型的中心點的 X和Y座標 再輸入半徑");
                    coordinate.addShape(new Circle(new Point(scanner.nextInt(), scanner.nextInt()), scanner.nextInt()));
                }
                else if(choice == 2) {
                System.out.println("請輸入兩組 X和Y座標");
                    coordinate.addShape(new Rectangle(new Point(scanner.nextInt(), scanner.nextInt()), new Point(scanner.nextInt(), scanner.nextInt())));
                }
            }
            else if(op == 2) {
                System.out.println("請輸入兩個位置");
                System.out.println(coordinate.compareArea(scanner.nextInt(), scanner.nextInt()));
            }
            else if(op == 3) {
                System.out.println("請輸入兩個位置");
                System.out.println(coordinate.getDistance(scanner.nextInt(), scanner.nextInt()));
                
            }
            System.out.println("=============");
        }

    }
    
}

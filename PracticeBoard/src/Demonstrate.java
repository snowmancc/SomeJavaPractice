
import java.util.*;
import java.util.Scanner;

public class Demonstrate {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            int count = 0;
            int number;
            while ((number = scanner.nextInt()) != 0) {
                sum += number;
                count += 1;
            }
            System.out.println(sum / count);
        } catch (InputMismatchException ex) {
            System.out.println("必須輸入正整數");
        }
    }

}

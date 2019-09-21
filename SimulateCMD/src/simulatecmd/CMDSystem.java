
package simulatecmd;

import java.util.Scanner;

public class CMDSystem {
    private Directory nowD;
    private String address;
    
    public void start() {       
        Scanner scanner = new Scanner(System.in);
        Directory root = new Directory("root", null);
        nowD = root;
        String address = "\\" + "root";
        
        String order;
        String name;
        
        while(true) {
            System.out.print(address + ">");
            
            String input = scanner.nextLine();
            String[] inputA = input.split("\\s+");
            
            if (inputA.length == 1) {
                order = inputA[0];
                name = null;
            }
            else {
                order = inputA[0];
                name = inputA[1];
            }
            
            if (order.equals("ls")) {
                System.out.println(nowD);
            }
            else if(order.equals("mkdir")) {
                if (name != null) {
                    nowD.createDirectory(name, nowD);
                }
            }
            else if (order.equals("touch")) {
                if (name != null) {
                    nowD.createFile(name);
                }
                
            }
            else if (order.equals("cd")) {
                if (nowD.intoDirectory(name) != null) {
                    nowD = nowD.intoDirectory(name);
                    address = address + "\\" + name;
                }
                
            }
            else if (order.equals("cd..")) {
                address = address.replace(nowD.getName(), "");
                nowD = nowD.getParent();
            }
            else if (order.equals("search")) {
                System.out.println(nowD.search(name));
            }
            System.out.println("============");
        }
    }
}


package bookcabinet;

public class Book {
    public  int bookAddress;
    private String name;
    private int age;
    private int month;
    private int cabintAddress;
    private String style;
    
    
    public Book(int bookAddress, String name, int cabintAddress, String style) {
        this.bookAddress = bookAddress;
        this.name = name;
        this.age = 0;
        this.month = 0;
        this.cabintAddress = cabintAddress;
        this.style = style;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getAddress() {
        return bookAddress;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getMonth() {
        return month;
    }
    
    @Override
    public String toString() {
        String str ="";
        if (age == 0) {
            str =  name + "/" + style ;
        }
        else if (age > 0){
             str = name + "/" + style + " " + age + "/" + month;
        }
        return str;
    }
    
    public boolean haveBook(int bookAddress) {
        if (this.bookAddress == bookAddress) {
            return true;
        }
        else {
            return false;
        }
    } 
}

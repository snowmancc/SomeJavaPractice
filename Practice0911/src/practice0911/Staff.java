
package practice0911;

public class Staff {
    
    private String name;
    private int year;
    private int month;
    private int date;
    private String phone;
    
    public Staff(String name, int year, int month, int date, String phone ) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.date = date;
        this.phone = phone;
    }
    
    public String toString() {
        return name + " " + year + " " + month + " " + date + " " + phone;
    }
}

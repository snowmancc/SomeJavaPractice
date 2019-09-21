
package practice0911;

public class Student extends Staff{
    
    private long  number;
    private float score;
    
    public Student(String name, int year, int month, int date, String phone, long number, float score) {
        super(name,year,month,date,phone);
        this.number = number;
        this.score = score;
        //name,year,month,date,phone
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + number + " " + score;
    }
    
    
}

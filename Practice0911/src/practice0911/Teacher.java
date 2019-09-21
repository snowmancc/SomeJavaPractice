
package practice0911;

public class Teacher extends Staff{
    
    private String object;
    
    public Teacher(String name, int year, int month, int date, String phone, String object) {
        super(name,year,month,date,phone);
        this.object = object;
        //name,year,month,date,phone
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + object;
    }
    
}

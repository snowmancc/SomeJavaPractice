
package practice0911;

public class Worker extends Staff{
    
    private String work;
    
    public Worker(String name, int year, int month, int date, String phone, String work) {
        super(name,year,month,date,phone);
        this.work = work;
        //name,year,month,date,phone
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + work;
    }
    
    
}

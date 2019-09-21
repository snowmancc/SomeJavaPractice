
package schoolsystem;

public class Student {
    private String name;
    private int age;
    private int address;
    private int score;
    
    public Student(String name, int age, int address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = 0;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getAddress () {
        return address;
    }
    
    public int getScore() {
        return score;
    }
    
    public int compare(Student student) {
        if(this.score >student.score) {
            return 1;
        }
        else if(this.score <student.score) {
            return -1;
        }
        return 0;
    }
    
    public boolean checkScore(int min, int max) {
        if (this.score > min && this.score < max) {
            return true;
        }
        else {
            return false;
        }
    }
}


package scoreinputinterface;

public class Student {
    private int address;
    private int score;
    
    public Student(int address, int score) {
        this.address = address;
        this.score = score;
    }
    
    public int getAddress() {
        return this.address;
    }
    
    public int getScore() {
        return this.score;
    }
    
    @Override
    public String toString() {
        return address + " " + score;
    }
}

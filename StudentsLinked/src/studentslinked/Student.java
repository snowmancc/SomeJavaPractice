
package studentslinked;

public class Student {
    String name;
    String id;
    int score;
    
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public void setScore(int score) {
        this.score = score;
    } 
    
    public int getScore() {
        return score;
    }
}

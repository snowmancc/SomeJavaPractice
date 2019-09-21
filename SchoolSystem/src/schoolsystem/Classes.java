
package schoolsystem;

public class Classes {
    String teacher;
    int age;
    String name;
    Student[] students;
    int index;
    
    public Classes(int age, String name) {
        this.age = age;
        this.name = name;
        this.students = new Student[5];
        index = 0;
    }
    
    public void setTeacher(String name) {
        this.teacher = name;
    }
    
    public void setStudent(String name) {
        this.students[index] = new Student(name,this.age,(this.index + 1));
        index += 1;
    }
    
    public void setScore(int address, int score) {
        int index = address - 1;
        students[index].setScore(score);
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean canAdd() {
        if (index == 5) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public String searchName(String name) {
        String str ="";
        if (name.equals(teacher)) {
            str = str + this.teacher + " 教師/帶領"+ this.age + "年級 " + this.name + "班 " + "\n";
        }
        for (int i = 0; i < index; i++) {
            if (name.equals(students[i].getName())) {
               str = str + this.students[i].getName() + " 學生/所屬"+ this.age + "年級 " + this.name + "班 " + 
                       "成績: "+ this.students[i].getScore()+ "\n";
           }
        }
        return str;
    }
    
    public boolean haveOne(int address) {
        index = address - 1;
        if (index < this.index) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String str = "";
        str = str + this.age + "年級" + " "+ this.name + " 班" + "  授課老師: " + teacher + "\n";
        
        for(int i = 0; i < index; i++) {
            str = str + "      " + students[i].getAddress() + "號: " + students[i].getName() + "成績: " + students[i].getScore() + "分" + "\n";
        }
        return str;
    }
    
    public String searchScore(int min , int max) {
        String str = "";
        int counter = 0;
        str = str + this.age + "年級" + " "+ this.name + " 班" + "授課老師: " + teacher + "\n";
        for (int i = 0; i < index; i++) {
            if (students[i].checkScore(min, max)) {
               str = str + "                " + students[i].getAddress() + "號: " + students[i].getName() + "成績: " + students[i].getScore() + "分" + "\n";
               counter += 1;
            }
        }
        if (counter > 0) {
            return str;
        }
        return null;
    }
  
}

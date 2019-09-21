/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystem;

/**
 *
 * @author user
 */
public class Students {
    Student[] array;
    int index;
    
    public Students () {
        this.array = new Student[2];
        this.index = 0;
    }
    private Student[] extend (Student[] array) {
        Student[] tmp = new Student[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }
    
    public void addStudent (int num, String name) {
        if (num < 1) {
            System.out.println("請輸入正整數");
        }
        else {
            if (!sameAddress(num)) {
                if (index == this.array.length) {
                    this.array = extend(this. array);

                }
                array[index] = new Student();
                array[index].setAddress(num);
                array[index].setName(name);
                array[index].setScore(0);
                index += 1;
            }
        }
        
    }

    public void setScore (int address, int score) {
        int index =getIndex(address,this.index);
        if ( index != -1) {
            this.array[index].setScore(score);
        }
        else {
            System.out.println("沒有該學生資料");
        }
    }
    
    private  int getIndex (int address,int index) {
        for (int i = 0; i < index; i++) {
            if (array[i].getAddress() == address) {
                return i;
            }
        }
        return -1;
    }
    
    public String toString () {
        String str = "";
        for (int i = 0; i < index; i++) {
            str = str + array[i].getName() + "         "+ array[i].getAddress() +"         " + array[i].getScore() + "\n";
        }
        return str;
    }
    
    public void sortScore() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (array[j].getScore() < array[j + 1].getScore()) {
                    Student tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
  
     public void sortAddress() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (array[j].getAddress() > array[j + 1].getAddress()) {
                    Student tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
       
    
    
    private boolean sameAddress (int num) {
        for (int i = 0; i < index; i++) {
            if (array[i].getAddress() == num) {
                return true;
            }
        }
        return false;
    }    
    
}

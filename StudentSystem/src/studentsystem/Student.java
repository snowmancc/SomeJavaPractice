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
public class Student {
    private String name;
    private int address;
    private int score;
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    public void setAddress (int num) {
        this.address = num;
    }
    
    public int getAddress () {
        return address;
    }
    
    public void setScore (int score) {
        if (score > 100 || score < 0) {
            this.score = 0;
        }
        this.score = score;
    }
    
    public int getScore () {
         return score;
    }
    
}

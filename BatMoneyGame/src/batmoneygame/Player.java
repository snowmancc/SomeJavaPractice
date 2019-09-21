/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batmoneygame;

/**
 *
 * @author user
 */
public class Player {
    private String name;
    private int money;
    
    public Player (String name, int money) {
        this.name = name;
        this.money = money;
    }
    
    public void bet (int money) {
        
        this.money -= money;
    }
    
    public int getMoney () {
        return money;
    }
    
    public void addMoney(int money) {
        this.money += money;
    }
    
    public String getName () {
        return name;
    }
}


package zoo;

public class Animal { //標記MARK 用來做分類的判斷
    private String name;
    private int weight;
    
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight(){
        return weight;
    }
    
}

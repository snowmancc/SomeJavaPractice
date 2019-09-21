
package ecosystem;

public interface BiologicalAction {
    
    /*
        系統給能夠走的所有可以走的範圍 不同物種依照自己的限制選擇一個點輸出  
    */
    public Point move (Point[] point); 
    
    public boolean eat();
    
    public boolean brand();
    
}

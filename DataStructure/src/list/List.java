
package list;

public interface List {
    
    public void add(int data);
   
    public int get(int index);
    
    public boolean remove(int index);
    
    public boolean insert(int data, int index);
    
    public int size();
    
    public int InOrder();
    
   public void reset();
}

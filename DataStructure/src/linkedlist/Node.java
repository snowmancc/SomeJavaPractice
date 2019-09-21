
package linkedlist;

public class Node {
    private int data;
    private Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    public void newNode(int data) {
        next = new Node(data);
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public int getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
    
}

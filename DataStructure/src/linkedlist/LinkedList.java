
package linkedlist;

import list.InturnNext;
import list.List;

public class LinkedList implements List{
    private Node root;
    private int size;
    private Node nowNode;
    
    public LinkedList() {
        size = 0;
    }
    
    @Override
    public void add(int data) {
        if(root == null) {
            root = new Node(data);
            reset(); //紀錄點
        }
        else {
            Node now = root;
            while(now.getNext() != null) {
                now = now.getNext();
            }
            now.newNode(data);
        }
        size += 1;
    }
    
    @Override
    public int get(int index) {
        if(index < 0) {
            return -1;
        }
        Node node = getNode(index);
        if(node == null) {
            return -1;
        }
        return node.getData();
    }
    
    private Node getNode(int index) {
        Node now = root;
        for(int i = 0; i < index; i++) {
            if(now.getNext() == null) {
                return null;
            }
            else {
                now = now.getNext();
            }
        }
        return now;
    }
    
    @Override
    public boolean remove(int index) {
        if(index < 0 || root == null) { //防呆
            return false;
        }
        
        if (index == 0) {
            this.root = root.getNext();
            size -= 1;
            return true;
        }
        Node now = getNode(index);
        now.setNext(now.getNext().getNext());
        size -= 1;
        return true;
    }
    
    @Override
    public boolean insert(int data, int index) {
        if(index < 0) {
            return false;
        }
        Node newNode = new Node(data);
        if(index == 0) {
            newNode.setNext(root);
            root = newNode;
            size += 1;
            return true;
        }
        
        Node now = getNode(index - 1);
        if(now == null) {
            return false;
        }
        newNode.setNext(now.getNext());
        now.setNext(newNode);
        size += 1;
        return true;
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int InOrder() {
        if(nowNode == null) {
            reset();
        }
        int nowData = nowNode.getData();
        nowNode = nowNode.getNext();
        return nowData;
    }

    @Override
    public void reset() {
            nowNode = root;
    }
    
}


package arraylist;

import list.InturnNext;
import list.List;

public class ArrayList  implements List{
    private int[] arrayList;
    private int index;
    private int nowPlace;
    
    public ArrayList() {
        this.arrayList = new int[2];
        this.index = 0;
        reset();
    }
    
    private void doubleArray() {
        int[] tmp = new int[this.arrayList.length * 2];
        for(int i = 0; i < arrayList.length; i++) {
            tmp[i] = arrayList[i];
        }
        this.arrayList = tmp;
    }
    
    @Override
    public void add(int data) {
        if(index == arrayList.length) {
            doubleArray();
        }
        arrayList[index] = data;
        index += 1;
    }
    
    @Override
    public int get(int index) {
        if(index >= this.index || index < 0) {
            return -1;
        }
        if(index >= this.index) {
            return -1;
        }
        return arrayList[index];
    }
    
    @Override
    public boolean remove(int index) {
        if(index >= this.index || index < 0) {
            return false;
        }
        for(int i = index; i < this.index - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        this.index -= 1;
        return true;
    }
    
    @Override
    public boolean insert(int data, int index) {
        if(index >= this.index || index < 0) {
            return false;
        }
        if(this.index == arrayList.length) {
            doubleArray();
        }
        for(int i = this.index; i > index; i--) {
            arrayList[i] = arrayList[i - 1];
        }
        arrayList[index] = data;
        this.index += 1;
        return true;
    }

    @Override
    public int size() {
        return index;
    }
    
    
    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < index; i++) {
            str = str + arrayList[i] + " ";
        }
        
        return str;
    }

   @Override
    public int InOrder() {
        if(nowPlace == index) {
            reset();
        }
        int data = arrayList[nowPlace];
        nowPlace += 1;
        return data;
    }

    @Override
    public void reset() {
        nowPlace = 0;
    }
    
}

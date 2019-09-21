
package zoo;

import java.util.Arrays;

public class Cage {
    private Animal[] cage;
    private int index;
    
    public Cage() {
        cage = new Animal[5];
        index = 0;
    }
    
    public void addAnimal(Animal animal) {
        doubleArray();
        cage[index] = animal;
        index += 1;
    }
    
    private void doubleArray() {
        cage = Arrays.copyOf(cage, cage.length * 2);
    }
    
    public void cutLine(Animal animal, int address) {
        if (index == cage.length) {
            doubleArray();
        }
        if (address > index) {
            return ;
        }
        for(int i = address; i <= index + 1 ; i++) {
            Animal tmp = cage[i];
            cage[i] = animal; 
            animal = tmp;
        }
        index += 1;
    }
    
    public void deleteAnimal(int address) {
        if (address == index) {
            return ;
        }
        cage[address] = null;        
        for(int i = address; i < index - 1; i++) {
            Animal tmp = cage[i];
            cage[i] = cage[i + 1];
        }
        index -= 1;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < index; i++) {
            str = str + cage[i].getName() + "\n";
        }
        return str;
    }
    
    public Animal getAnimal(int index) {
        if(index == this.index) {
            return null;
        }
        return cage[index];
    }
    
    public int length () {
        return index;
    }
    
    public void swap(int address1, int address2) {
        Animal tmp = cage[address1];
        cage[address1] = cage[address2];
        cage[address2] = tmp;
    }
    
    public void kindSort() {
        
    }
    
}

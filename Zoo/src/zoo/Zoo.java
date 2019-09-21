
package zoo;

public class Zoo {


    public static void main(String[] args) {
        
        Dog dog1 = new Dog("cdog1 30", 30);
        Cat cat = new Cat("bcat 20", 20);
        Dog dog3 = new Dog("adog3 35", 35);
        Dog dog4 = new Dog("bdog4 15", 15);
        Mouse mo1 = new Mouse("amo1 15", 15);
        Mouse mo2 = new Mouse("zmo2 5", 5);
        
        
        Cage cage = new Cage();
        
        cage.addAnimal(dog1);
        cage.addAnimal(cat);
        cage.addAnimal(dog3);
        cage.addAnimal(dog4);
        cage.addAnimal(mo1);
        cage.addAnimal(mo2);
        
        System.out.println(dog1);
        
        System.out.println(cage);
       
        nameSort(cage);
        System.out.println(cage);
        
        weightSort(cage);
        System.out.println(cage);
        
        cage.kindSort();;
        System.out.println(cage);

    }
    
    public static void nameSort (Cage cage) {
        
        for(int i = 0; i < cage.length() - 1; i ++) {
            for(int j = 0; j < cage.length() - i - 1; j++) {
                if(cage.getAnimal(j).getName().compareTo(cage.getAnimal(j + 1).getName()) > 0) {
                    cage.swap(j, j + 1);
                }
            }
        }
    }
    
    public static void weightSort(Cage cage) {
        
        for(int i = 0; i < cage.length() - 1; i ++) {
            for(int j = 0; j < cage.length() - i - 1; j++) {
                if(cage.getAnimal(j).getWeight() <cage.getAnimal(j + 1).getWeight()) {
                    cage.swap(j, j + 1);
                }
            }
        }
        
    }
    
    public static Cage kindSort(Cage cage) {
        return cage;
    }
    
}

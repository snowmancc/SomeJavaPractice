
package scoreinputinterface;

public class CompareScore implements CompareInterface{

    @Override
    public boolean compare(Student s1, Student s2,SortOrderInterface order) {
       return order.sort(s1.getScore(), s2.getScore());
    }
    
}

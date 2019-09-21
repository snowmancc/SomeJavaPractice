
package scoreinputinterface;

public class CompareAddress implements CompareInterface{

    @Override
    public boolean compare(Student s1, Student s2, SortOrderInterface order) {
        return order.sort(s1.getAddress(), s2.getAddress());
    }
    
}

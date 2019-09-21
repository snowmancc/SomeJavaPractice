
package scoreinputinterface;

public class SortSmallToBig implements SortOrderInterface{

    @Override
    public boolean sort(int num1, int num2) {
        return num1 > num2;
    }
    
}

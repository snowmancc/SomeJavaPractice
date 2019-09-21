
package bubblesortinstance;

public class CompareSmallToBig implements CompareInterface{

    @Override
    public boolean compare(int num1, int num2) {
        return num1 > num2;
    }
    
}


package scoreinputinterface;

class SortBigToSmall implements SortOrderInterface{

    @Override
    public boolean sort(int num1, int num2) {
        return num1 < num2;
    }
    
}

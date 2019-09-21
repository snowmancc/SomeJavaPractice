
public class BinarySearch {
    
    public static int binarySearch (int[] array, int search) {
        int middle;
        int right = array.length - 1;
        int left = 0;
        while(left <= right){
            middle = (right + left) / 2;
            if (array[middle] == search) {
                return middle;
            }
            if (array[middle] > search) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int search = 6;
        
        System.out.println(binarySearch(array,search));
    }
}

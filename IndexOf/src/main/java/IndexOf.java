import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex (int[] arr, int n){
        
        List<Integer> newlist = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            newlist.add(arr[i]);
        }
        int element = newlist.indexOf(n);
        return element;
    

    
    }
}

import java.util.*;

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){

        Integer [] BoxedArray = new Integer[arr.length];
        for(int i = 0; i < BoxedArray.length; i++){
            BoxedArray[i] = Integer.valueOf(arr[i]);
        }
        int maxValue = Collections.max(Arrays.asList(BoxedArray));
        return maxValue;

        
    }
}

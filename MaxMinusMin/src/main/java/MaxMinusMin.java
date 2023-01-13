
import java.util.*;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        Integer num1 = Collections.max(nums, null);
        Integer num2 = Collections.min(nums);
        int NUM1 = num1;
        int NUM2 = num2;

        return NUM1 - NUM2;
    }
}

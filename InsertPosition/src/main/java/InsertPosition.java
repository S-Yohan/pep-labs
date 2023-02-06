import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position
     * 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums   an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted
     *         array.
     */
    public int searchInsert(int[] nums, int target) {

        // This command sorts nums.
        Arrays.sort(nums);

        // The sorted array will be entered into a larger array to avoid any out of
        // bound errors.
        List<Integer> newArray = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            newArray.add(nums[i]);
        }
    

       // The return object, index, is initialized here to 0;
        int index = 0;

        // In this for loop the index of the element to be replaced is returned from the
        // newArray list once the conditions are met in the if statement.

        for(int j = 0; j < newArray.size() ; j++){
            
            if((newArray.get(j) < target) && (newArray.get(j+1)) > target){
                newArray.set(j+1, target);
                return index = j+1;
            } 
        }

        return index;

    }
}

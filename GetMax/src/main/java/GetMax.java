public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        try{
            for(int i = 0; i <= arr.length -1; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i + 1] = temp;
                } 
            } return arr[-1];

        } catch(Exception e){
            return arr[-1];
        }
             
    }
}

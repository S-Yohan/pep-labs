import java.util.Arrays;

public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to
     * the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you
     * iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two
     *         arrays are identical.
     */
    public int compare(char[] a, char[] b) {
        
        Boolean Outcome = Arrays.equals(a, b);
        int size = a.length < b.length ? a.length : b.length;
        int Output = 0;

        //This if statement returns 0 if the arrays are equal
        if (Outcome == true) {
            Output = 0;
        // If the arrays are not equal this else condition will use a for loop 
        //to compare all the elements in the shorter array. 
        //The length of the shorter array is used to avoid iterating out of bounds.    
        } else if (Outcome == false) {
            for (int i = 0; i < size - 1; i++) {
                if (a[i] < b[i]) {
                    Output = -1;
                } else {
                    Output = 1;
                }
            }
        }
        return Output;

    }
}

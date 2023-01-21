import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        List<Integer> lengthlist = new ArrayList<>();
        for(String elem: arr){
            lengthlist.add(elem.length());
        }
        int Longest = Collections.max(lengthlist);
        int index = lengthlist.indexOf(Longest);
        return arr[index];
        
    }
}

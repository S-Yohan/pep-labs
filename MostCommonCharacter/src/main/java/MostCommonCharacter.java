import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to
     * represent how many times a Character has
     * been spotted.
     * 
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        //Converting the str to a char array
        char CharData[];
        CharData = str.toCharArray();
        //Instantiating a HashMap with a key<Character> and a value<Integer>
        HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();

        //Output variable is initalized
        char Output = ' ';
        for (char c : CharData) {
            
            if (CharCount.containsKey(c)) {
                CharCount.put(c, CharCount.get(c) + 1);
            } else {
                CharCount.put(c, 1);
            }
        }
        Integer MostFrequent = Collections.max(CharCount.values());
        for (final Entry entry : CharCount.entrySet()) {
            if (entry.getValue() == MostFrequent) {
                Output = (char) entry.getKey();
            }
        }

        return Output;
    }
}

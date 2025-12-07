
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAlienDictionarySorted(String[] words, String order) {
        /**
         * Creating an order map for storing the occurance of a character along with its
         * position in the ordermap
         */
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            // fill the order map hashmap
            orderMap.put(order.charAt(i), i);
        }
        /**
         * Iterate over all the words and inside every words we compare it with its
         * adjacent word character by character.
         * 
         * Please note that we use length-1 because if we reach the last word, we do
         * not need to compare that and we also do not want to get out of bounsd
         * exception here.
         */
        for (int i = 0; i < words.length - 1; i++) {
            /**
             * Another for loop to compare every adjacent character between two words.
             */
            for (int j = 0; j < words[i].length(); j++) {
                // batman, bat
                if (j >= words[i + 1].length()) {
                    return false;
                }
                // comparing alphabets by alphabet of current and next word
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int currentLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i + 1].charAt(j));
                    if (nextLetter < currentLetter) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }

}

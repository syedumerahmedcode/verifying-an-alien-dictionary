
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * In an alien language, surprisingly, they also use English lowercase
         * letters, but possibly in a different 'order'. The order of the
         * alphabets is some permutation of lowercase letters.
         * 
         * Gievn a seguence of words written in an alien language and the order
         * of thr alphabets, return true if and only if the given words are sorted
         * lexiographically in this alien language.
         * 
         * Input: words=['hello', 'leetcode'], order="hlabcdefgijkmnopqrstuvwxyz"
         * Output: true
         * Explanation: As 'h' comes before 'l' in this language, then the sequence is
         * sorted.
         * 
         * Input: words=['word','world','row'], order='worldabcefghijkmnpqstuvxyz'
         * Output: false
         * Explanation: As 'd' comes after 'l' in this language, then words[0]>word[1],
         * hence the sequence is unsorted.
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        String[] words = { "hello", "leetcode" };
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        String[] secondSetofWords = { "word", "world", "row" };
        String secondOrder = "worldabcefghijkmnpqstuvxyz";

        String[] thirdSetofWords = { "will", "chris", "bat", "batwoman", "batman" };
        String[] fourthSetofWords = { "will", "chris", "bat", "batman", "batwoman" };
        String thirdOrder = "wcabdefhgjilknmopqrsuxtvyz";

        boolean lexiographicallySorted = false;
        lexiographicallySorted = solution.isAlienDictionarySorted(words, order);
        System.out.println("The set of words is: " + Arrays.toString(words) + " and the order is: " + order
                + ". Are they lexiographically sorted: " + lexiographicallySorted);
        System.out.println();

        lexiographicallySorted = solution.isAlienDictionarySorted(secondSetofWords, secondOrder);

        System.out.println("The set of words is: " + Arrays.toString(
                secondSetofWords) + " and the order is: " + secondOrder
                + ". Are they lexiographically sorted: " + lexiographicallySorted);
        System.out.println();

        lexiographicallySorted = solution.isAlienDictionarySorted(thirdSetofWords, thirdOrder);
        System.out.println("The set of words is: " + Arrays.toString(
                thirdSetofWords) + " and the order is: " + thirdOrder
                + ". Are they lexiographically sorted: " + lexiographicallySorted);

        System.out.println();

        lexiographicallySorted = solution.isAlienDictionarySorted(fourthSetofWords, thirdOrder);
        System.out.println("The set of words is: " + Arrays.toString(
                fourthSetofWords) + " and the order is: " + thirdOrder
                + ". Are they lexiographically sorted: " + lexiographicallySorted);
    }
}

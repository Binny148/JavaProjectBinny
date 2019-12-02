package JavaPractice;
import java.util.Arrays;
public class isAnagramNum {

        public static void main(String[] args) {

            System.out.println(isAnagram("hi", "jey"));
        }

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");
        if (word1.length() != word2.length()) {
            return false;
        } else {
            char[] arr1 = word1.toLowerCase().toCharArray();
            char[] arr2 = word2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return (Arrays.equals(arr1, arr2));
        }
    }

}

package JavaPractice;
import java.util.Arrays;
public class arrayAnagram {
    public static void main(String[] args) {

        String [] array = {"listen","book","linest", "adf"};
       String word="silent";
        System.out.println(Arrays.toString(findAnagram("silent",array)));

    }
        public static String [] findAnagram(String word1, String [] array){
            String w1 = "";
            String w2 = "";
            String anagram="";
            for(int k=0; k<array.length; k++){
                String word2=array[k];
                for (int i = 0; i < word1.length(); i++) {
                    for (int j = 0; j < word2.length(); j++) {
                        if (word1.charAt(i) == word2.charAt(j)) {
                            w1 = word1.substring(i, i + 1);
                            w2 = word2.replace(w1, "");
                        }
                    }
                }
                if (w1.equals("")) {
                    anagram +=(" "+word2);

                } else {
                    continue;
                }}
            return anagram.split(" ");
        }

}

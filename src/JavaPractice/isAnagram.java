package JavaPractice;

public class isAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("java", "cava"));
    }


    public static boolean isAnagram(String word1, String word2){
        String w1 = "";
        String w2 = "";
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    w1 = word1.substring(i, i + 1);
                    w2 = word2.replace(w1, "");
                }
            }
        }
        if (w1.equals("")) {
            return true;

        } else {
            return false;
        }
    }
}

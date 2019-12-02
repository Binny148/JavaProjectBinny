package Arrays;

import java.util.Arrays;
public class maxStringArray {

    public static void main(String[] args) {
        /*
    Find the maximum String from array
    */

        String [] word = {"aaa","bbbbb","cccccccc","dddd","ffffffffff"};
        int max = word[0].length();
        String maxWord="";

        for(int i = 1; i<5;i++){
            if(word[i].length() > max){
                maxWord=word[i];
            }
        }
        System.out.println("Maximun word is : " + maxWord);
    }
}

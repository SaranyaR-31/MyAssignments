package Assignment4;

import java.util.Arrays;

public class AnagramExample {

    public static boolean areAnagrams(String str1, String str2) {
       
        // Check if lengths are different

        if (str1.length() != str2.length()) {

            return false;

        }

        // Convert strings to char arrays and sort them

        char[] charArray1 = str1.toCharArray();

        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);

        Arrays.sort(charArray2);

        // Compare the sorted char arrays

        return Arrays.equals(charArray1, charArray2);

    }

    public static void main(String[] args) {

     String word1="stops";
      String word2="potss";

        if (areAnagrams(word1, word2)) {

            System.out.println("The Given string is Anagram");

        } else {

            System.out.println("The Given string is not Anagram");
  
        }

    }

}


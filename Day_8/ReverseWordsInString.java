package Day_8;

import java.util.*;
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Step 3: Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" "); // add space between words
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseWords("the sky is blue"));     // "blue is sky the"
        System.out.println(reverseWords("  hello world  "));     // "world hello"
        System.out.println(reverseWords("a good   example"));    // "example good a"
        System.out.println(reverseWords("    "));                // ""
        System.out.println(reverseWords("word"));                // "word"
    }
}

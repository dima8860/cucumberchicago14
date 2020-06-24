package InterviewPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromeSubString {
    public static void main(String[] args) {
    String s = "myracecar";
        System.out.println(PalindromeSubString.findAllPalindromesUsingBruteForceApproach(s));
        Set<String> palindrome = PalindromeSubString.findAllPalindromesUsingBruteForceApproach(s);
        List<String> list = new ArrayList<>(palindrome);
        System.out.println(list.get(list.size()-1));
        String laregest = list.get(0);
        for(String word: list) {
            if(word.length() > laregest.length()) {
                laregest = word;
            }
        }
        System.out.println(laregest);


    }
    public static Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes;
    }
    private static boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }
}

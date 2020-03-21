package mentoring.InterviewJava;

import java.util.*;

public class Task2 implements Animal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};
        int num = 100000;
        System.out.println(Arrays.toString(addNumberToArray(arr, num)));
        System.out.println(isAnagram("abc", "bac"));
        System.out.println(lengthOfLongestSubstring("abca"));
        System.out.println(lengthOfLongestSubstringMAP("abca"));
        System.out.println(lengthOfLongestSubstringSET("abca"));
        System.out.println(fibonacci(6));
    }
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==0) return 0;

        return fib(n-2 + fib(n-1));

    }

    public static int fibonacci(int n) {
        int slast = 0;
        int last  = 1;
        int position = 2;
        Map<Integer, Integer> map = new HashMap<>();
        while (position <= n) {
            int next = slast + last;
            map.put(position, next);
            slast = last;
            last = next;
            position++;
        }
    return map.get(n);

    }

    public static int[] addNumberToArray(int[] nums, int num) {
        String strNum = Arrays.toString(nums);
        strNum = strNum.replace("[", "").replace("]", "").replace(",", "").replace(" ", "").trim();
        int numbersArr = Integer.valueOf(strNum);
        int sum = numbersArr + num;
        String sumStr = String.valueOf(sum);

        int[] finalArr = new int[sumStr.length()];
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = Integer.parseInt(sumStr.charAt(i) + "");
        }

        return finalArr;
    }

    public static boolean isAnagram(String wordOne, String wordTwo) {
        // apple
        int[] count = new int[26];

        for (int i = 0; i < wordOne.length(); i++) {
            char one = wordOne.charAt(i);
            char two = wordTwo.charAt(i);

            // count[0] -> 'a'
            // count[26] -> 'z'
            count[one - 'a'] = count[one - 'a'] + 1;
            count[two - 'a'] = count[two - 'a'] - 1;
        }
        return Arrays.equals(count, new int[26]);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] cArr = word.toCharArray();
            Arrays.sort(cArr);
            String key = String.valueOf(cArr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static int lengthOfLongestSubstring(String s) {
        String str = "";
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(s.charAt(i) + "")) {
                str += s.charAt(i) + "";
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    public static int lengthOfLongestSubstringMAP(String word) {
        Map<String, Integer> map = new HashMap<>();
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i) + "")) {
                map.put(word.charAt(i) + "", i);
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    public static int lengthOfLongestSubstringSET(String word) {
        Set<String> set = new HashSet<>();
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!set.contains(word.charAt(i) + "")) {
                set.add(word.charAt(i) + "");
                length++;
            } else {
                break;
            }
        }
        return length;
    }
}


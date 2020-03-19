package mentoring.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Taks1 {

    public static void main(String[] args) {
        int [] arr = {0,-2,8,10,-10};
        System.out.println( smallestAndLargestNumber(arr));

        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("aba");
        list.add("almmla");
        list.add("qq");
        list.add("maaaaaaaam");
        list.add("qwe");
        list.add("wwwwwww");
        list.add("1");
        System.out.println(biggestPalindrome(list));

        int [] arr1 = {1,4,5,3,3,1,4,5};
        System.out.println(singleNumber(arr1));

        ArrayList<String> one  = new ArrayList<>();
        ArrayList<String> two  = new ArrayList<>();
        ArrayList<String> three  = new ArrayList<>();
        one.add("mon"); one.add("omn");
        two.add("h j"); two.add("jh ");
        three.add("h j"); three.add("jh ");
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        lists.add(one); lists.add(two); lists.add(three);
        System.out.println(totalNumberOfAnagrams(lists));


    }

    public static String smallestAndLargestNumber(int [] arr) {
        int smallest = arr[0];
        int biggest = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i+1]) biggest = arr[i + 1];
            if(arr[i] > arr[i+1]) smallest = arr[i + 1];
        }
         String s = "Smallest: " + smallest + ", biggest: " + biggest;
        return s;
    }

    public static String biggestPalindrome(ArrayList<String> list){
        String biggest = "";
        for(String word: list) {
            for(int i = 0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1-i)) break;
                if((i == word.length()/2 - 1) && word.length() > biggest.length()) biggest = word;
            }
        }
        return biggest;

    }
// 3) Given a non-empty array of integers, every element appear twice, except for one. Return that number
//Ex:
//    Input: {1,4,5,3,3,1,4}
    public static int singleNumber(int [] arr) {
        int num = arr[0];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count == 1) return num = arr[i];

        }
        return num;
    }

    public static int notADuplicate(int [] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int number : nums) {
            if(!map.containsKey(number)){
                map.put(number, false);
            } else {
                map.remove(number);
            }
        }
//        for(Integer key: map.keySet()) {
//            if(!map.get(key)) return key;
//        }
        return ((int)map.keySet().toArray()[0]);
    }




    public static int totalNumberOfAnagrams(ArrayList<ArrayList<String>> words) {
        int count  = 0;

        for(ArrayList eachList: words) {
            char [] firstStr = eachList.get(0).toString().toCharArray();
        }
        // OR
        for(ArrayList<String> eachList: words) {
            char [] firstStr = eachList.get(0).toCharArray();
        }

        for(int i = 0; i < words.size(); i++) {
            char [] firstStr = words.get(i).get(0).toCharArray();
            char [] secondStr = words.get(i).get(1).toCharArray();

            Arrays.sort(firstStr);
            Arrays.sort(secondStr);

            if(Arrays.equals(firstStr, secondStr)) count++;

        }
        return count;
    }

}

package Reboot.JavaClass;

public class StringAndLoops1 {
    public static void main(String[] args) {
        // how many java words in the string
        String s = "java";
        int count = 0;
        for (int i = 0; i < s.length() - 3; i++) {
           if (s.substring(0+i,4+i).equals("java")) count++;
        }
        System.out.println(count);

        int count2 = s.split("java").length;
        System.out.println(count2);
    }


}

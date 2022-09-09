package array;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.equalsIgnoreCase(t))
            return true;

        char []sArray = s.toCharArray();
        char []tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if(String.valueOf(sArray).equalsIgnoreCase(String.valueOf(tArray)))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
    }
}

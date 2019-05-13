package com.junhua.algorithm.hash;

import java.util.HashMap;

/**
 * leetcode 242 valid anagram
 */
public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("abc", "cba"));
    }

    /**
     * 根据两个字符串字符的统计，比较
     * @param s
     * @param t
     * @return
     */
    private static boolean isAnagram(String s, String t) {

        return stringToCountMap(s).equals(stringToCountMap(t));
    }

    private static HashMap<Character, Integer> stringToCountMap(String s) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {
            if (integerHashMap.containsKey(sChar)) {
                integerHashMap.put(sChar, integerHashMap.get(sChar) + 1);
            } else {
                integerHashMap.put(sChar, 1);
            }
        }
        return integerHashMap;
    }


    /**
     * 创建一个只包含26位的数组，然后统计没个数组位上出现的数字
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }



}

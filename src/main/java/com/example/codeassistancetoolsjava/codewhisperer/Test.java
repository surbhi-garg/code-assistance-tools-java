package com.example.codeassistancetoolsjava.codewhisperer;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
/*    WAP to return a list of all unique words in the given string
   "Java is great. Javascript is awesome". Sort that list on the basis of number of vowels in it, decreasing order.*/
    static List<String> uniqueWordsAndSortBasedOnVowelCount(String str) {
        String [] words = str.split(" ");
        List<String> list = Arrays.stream(words).distinct().toList();
        Map<String, Integer> wordAndVowelCount = new HashMap<>();
        for(String word : list) {
            wordAndVowelCount.put(word, countVowels(word));
        }
        List<String> sortedList = new ArrayList<>(wordAndVowelCount.keySet());
        sortedList.sort((a, b) -> wordAndVowelCount.get(b) - wordAndVowelCount.get(a));
        return sortedList;
    }
    static int countVowels(String word) {
        int count = 0;
        for(char ch : word.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("In main");
        testUniqueWordsAndSortBasedOnVowelCount();
    }

    public static void testUniqueWordsAndSortBasedOnVowelCount() {
        String str = "Java is great. Javascript is awesome";
        List<String> list = uniqueWordsAndSortBasedOnVowelCount(str);
        System.out.println(list);

        String  str1 = "Java is great. Javascript is awesome. I am learning Java";
        List<String> list1 = uniqueWordsAndSortBasedOnVowelCount(str1);
        System.out.println(list1);
    }
}

package com.siemens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDistinctLettersCount {

    public static void main(String[] args) {
        FindDistinctLettersCount m = new FindDistinctLettersCount();
        List<String> testStrings = addTestStrings();

        for (String testStr : testStrings) {
            int count = m.solution(testStr);
            System.out.printf("The given string is \"%s\", and minimum deletion count : %d\n", testStr, count);
        }
    }

    /**
     *
     * @param testStr
     * @return Count of the minimum number of letters that must be deleted from a word to create a word in which
     *         no two letters occur the same number of times
     */
    private int solution(String testStr) {

        // this array will be used to store the character counts inside string
        int[] numberOfChars = new int[26];

        // to initialize all counts with zero(0)
        for (int i = 0; i < numberOfChars.length; i++) {
            numberOfChars[i] = 0;
        }
        // increment the count for all characters of given string inside numberOfChars array
        for (int i = 0; i < testStr.length(); i++) {
            int charIndex = testStr.charAt(i) - 'a';
            int count = numberOfChars[charIndex];
            numberOfChars[charIndex] = ++count;
        }

        // create the list of counts and add found chars into list
        List<Integer> strlist = new ArrayList<>();

        for (int i = 0; i < numberOfChars.length; i++) {
            if (numberOfChars[i] > 0)
                strlist.add(numberOfChars[i]);
        }

        // sort the array list in descending order
        Collections.sort(strlist);
        Collections.reverse(strlist);

        Integer[] counts = strlist.toArray(new Integer[strlist.size()]);

        // will keep the min.delete count to ensure distinct count of all characters
        int deleteCount = 0;

        // will iterate over the characters and if the count is same, then it will be reduced
        for (int i = 0; i < counts.length - 1; i++) {
            for (int j = i + 1; j < counts.length; j++) {
                if (counts[i] > 0 && counts[i] == counts[j]) {
                    int count = counts[j];
                    counts[j] = --count;
                    deleteCount++;
                }
            }
        }
        return deleteCount;
    }

    /**
     *
     * @return a List which includes example strings to test
     */
    private static List<String> addTestStrings() {
        List<String> strTestList = new ArrayList<>();
        strTestList.add("aaaabbbb");
        strTestList.add("ccaaffddecee");
        strTestList.add("eeee");
        strTestList.add("example");

        return strTestList;
    }

}

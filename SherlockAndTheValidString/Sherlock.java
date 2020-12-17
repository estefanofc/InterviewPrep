package SherlockAndTheValidString;

import java.util.HashSet;

public class Sherlock {

    public static String isValidString(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < freq.length; i++)
            if (freq[i] > 0)
                set.add(freq[i]);
        if (set.size() > 2)
            return "NO";
        if (set.size() == 1)
            return "YES";
        int f1 = 0;
        int f2 = 0;
        int f1Total = 0;
        int f2Total = 0;
        int count = 1;
        for (int i : set) {
            if (count == 1)
                f1 = i;
            else
                f2 = i;
            count--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == f1)
                f1Total++;
            if (freq[i] == f2)
                f2Total++;
        }
        if (f1 == 1 && f1Total == 1 || f2 == 1 && f2Total == 1)
            return "YES";
        if ((f1Total == 1 || f2Total == 1) && (Math.abs(f1 - f2) == 1))
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println("aabbcd -> " + isValidString("aabbcd"));
        System.out.println("aabbccddeefghi -> " + isValidString("aabbccddeefghi"));
        System.out.println("abcdefghhgfedecba -> " + isValidString("abcdefghhgfedecba"));
    }
}
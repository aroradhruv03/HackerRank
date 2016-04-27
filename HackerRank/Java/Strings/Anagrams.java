package Java.Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Java Anagrams
 *
 * Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

 Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

 This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

 Sample Input 1

 anagram
 margana
 Sample Output 1:

 Anagrams
 Sample Input 2

 anagramm
 marganaa
 Sample Output 2:

 Not Anagrams
 */
public class Anagrams {

    static boolean isAnagram(String A, String B) {
        // Check if null or empty
        if(A==null || B==null || A.length()==0 || B.length()==0)
            return false;
        // Check if same reference
        if(A==B)
            return true;
        // Check if length different
        if(A.length()!=B.length())
            return false;

        A = A.toLowerCase();
        B = B.toLowerCase();

        HashMap<Character,Integer> hashStr1 = new HashMap<>();
        HashMap<Character,Integer> hashStr2 = new HashMap<>();

        for(int i=0; i<A.length();i++)
        {
            char a = A.charAt(i), b=B.charAt(i);
            Object s1,s2;
            if( (s1 = hashStr1.get(a)) == null )
                hashStr1.put(a,1);
            else
                hashStr1.put(a,(int)s1+1);
            if( (s2 = hashStr2.get(b)) == null )
                hashStr2.put(b,1);
            else
                hashStr2.put(b,(int)s2+1);
        }
        return hashStr1.equals(hashStr2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}

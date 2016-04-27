package Java.Strings;

import java.util.Scanner;

/**
 * Java String Reverse
 *
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
 Given a string AA, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

 Some examples of palindromes are "madam", "anna", "reviver".

 Sample Input

 madam
 Sample Output

 Yes
 */
public class Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char arr[] = A.toCharArray();
        String isPalindrome = "Yes";
        int j=arr.length-1;

        for(int i=0;i<arr.length/2;i++,j--)
        {
            if(arr[i]!=arr[j])
            {
                isPalindrome = "No";
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}

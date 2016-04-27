package Java.Strings;

import java.util.Scanner;

/**
 * Java String Compare
 *
 * Given a string, find out the lexicographically smallest and largest substring of length k.

 [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

 Input Format

 First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

 Output Format

 In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 */
public class Compare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String high = s.substring(0,n), low = s.substring(0,n), sub="";
        int len = s.length()-n;

        for(int i=0;i<=len;i++)
        {
            sub = s.substring(i,n++);
            if(low.compareTo(sub)>0)
                low = sub;
            if(sub.compareTo(high)>0)
                high = sub;
        }
        System.out.println(low);
        System.out.println(high);
    }
}

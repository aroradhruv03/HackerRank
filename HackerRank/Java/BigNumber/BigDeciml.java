package Java.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Java BigDecimal
 *
 * Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!

 You are given nn real numbers, sort them in descending order! Read data from System.in.

 Note: To make the problem easier, we provided you the input/output part in the editor. Print the numbers as they appeared in the input, don't change anything. If two numbers represent numerically equivalent values, the output must list them in original order of the input.

 Input Format

 The first line will consist an integer nn, each of the next n lines will contain a real number. nn will be at most 200. The numbers can have at most 300 digits!

 Output Format

 Print the numbers in descending orders, one number in each line.

 Sample Input

 9
 -100
 50
 0
 56.6
 90
 0.12
 .12
 02.34
 000.000
 Sample Output

 90
 56.6
 50
 02.34
 0.12
 .12
 0
 000.000
 -100
 */
public class BigDeciml {

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        //BigDecimal bd[] = new BigDecimal[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }

        //Write your code here
        Arrays.sort(s, Collections.reverseOrder(new customComparator()));


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
    String s = "1";
int a = Integer.parseInt(s);


}

class customComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return new BigDecimal(o1).compareTo(new BigDecimal(o2));
    }
}

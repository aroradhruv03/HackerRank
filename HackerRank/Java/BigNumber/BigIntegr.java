package Java.BigNumber;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * Java BigInteger
 *
 * In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.

 Use the power of Java's BigInteger class and solve this problem.

 Input Format

 There will be two lines containing two numbers, aa and bb.

 Constraints

 aa and bb are non-negative integers and can have maximum 200200 digits.

 Output Format

 Output two lines. The first line should contain a+ba+b, and the second line should contain a×ba×b. Don't print any leading zeros.

 Sample Input

 1234
 20
 Sample Output

 1254
 24680
 Explanation

 1234+20=12541234+20=1254
 1234×20=24680
 */
public class BigIntegr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = sc.nextBigInteger();
        BigInteger b2 = sc.nextBigInteger();
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }

}

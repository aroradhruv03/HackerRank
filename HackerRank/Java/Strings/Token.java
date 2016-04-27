package Java.Strings;

import java.util.Scanner;

/**
 * Java String Token
 *
 * Given a string, find number of words in that string. For this problem a word is defined by a string of one or more english alphabets.

 There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your skill by solving this problem!

 Input Format
 A string not more than 400000 characters long. The string can be defined by following regular expression:

 [A-Za-z !,?.\_'@]+
 That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".

 Output Format
 In the first line, print number of words nn in the string. The words don't need to be unique. In the next nn lines, print all the words you found in the order they appeared in the input.

 Sample Input

 He is a very very good boy, isn't he?
 Sample Output

 10
 He
 is
 a
 very
 very
 good
 boy
 isn
 t
 he
 */
public class Token {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        //Complete the code
        if(s.trim().isEmpty() || s.trim().length()>400000)
            System.out.println('0');
        else{
            String[] result = s.trim().replaceAll("[\\_'.,!?@]"," ").split("[ ]+");
            System.out.println(result.length);
            for (int x=0; x<result.length; x++)
            {
                System.out.println(result[x]);
            }
        }
    }
}

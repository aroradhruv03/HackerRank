package Java.Intro;

import java.util.Scanner;

/**
 * Java Static Initializer Block
 *
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

 It's time to test your knowledge of Static initialization blocks. You can read about it here.

 You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth BB and height HH. You should read the variables from the standard input.

 If B≤0B≤0 or HH ≤0≤0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

 Input Format

 There are two lines of input. The first line contains BB: the breadth of the parallelogram. The next line contains HH: the height of the parallelogram.

 Constraints
 −100≤B≤100−100≤B≤100
 −100≤H≤100−100≤H≤100

 Output Format

 If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

 Sample input 1

 1
 3
 Sample output 1

 3
 Sample input 2

 -1
 2
 Sample output 2

 java.lang.Exception: Breadth and height must be positive

 */
public class StaticInitializer {
    static Scanner sc = new Scanner(System.in);
    static int B;
    static int H ;static boolean flag=true;
    static
    {
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H <= 0)
        {flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

//end of class
}

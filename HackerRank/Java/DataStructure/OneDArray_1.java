package Java.DataStructure;

import java.util.Scanner;

/**
 * Java 1D Array (Part 1)
 *
 * Array is a very simple data structure which is used to store a collection of data, for example roll number of all the students in a class or name of all the countries in the world. To create an array of integer that can hold 10 values, you can write code like this:

 int[] myList = new int[10];
 This problem will test your knowledge on java array.
 You are given an array of nn integers. A sub-array is "Negative" if sum of all the integers in that sub-array is negative. Count the number of "Negative sub-arrays" in the input array.

 Note: Subarrays are contiguous chunks of the main array. For example if the array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.

 Input Format

 The first line consists an integer nn. The next line will contain nn space separated integers. Value of n will be at most 100. The numbers in the array will range between -10000 to 10000.

 Output Format

 Print the answer to the problem.

 Sample Input

 5
 1 -2 4 -5 1
 Sample Output

 9

 Explanation

 These are the ranges of the 9 negative subarrays in this sample:

 [0:1]
 [0:3]
 [0:4]
 [1:1]
 [1:3]
 [1:4]
 [2:3]
 [3:3]
 [3:4]
 Assume that the index is 0 based.
 */
public class OneDArray_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++ )
            arr[i] = sc.nextInt();

        int count = 0;
        for(int i=0;i<size;i++)
        {
            int sum = 0;
            for(int j=i;j<size;j++)
            {
                sum += arr[j];
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
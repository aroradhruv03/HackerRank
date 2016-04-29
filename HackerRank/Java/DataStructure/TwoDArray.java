package Java.DataStructure;

import java.util.Scanner;

/**
 * @author Dhruv
 * @version 1.0
 */
public class TwoDArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int r =6, c = 6; // No of rows and columns
        int  maxSum=0;
        for(int i=0; i <= r-3; i++){
            for(int j=0; j <= r-3; j++){
                int sum=0;
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum +=  arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(i==0&&j==0)
                    maxSum=sum;
                if(maxSum<sum)
                    maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
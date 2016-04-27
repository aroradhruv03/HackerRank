package Java.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by dhruv on 4/26/16.
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

}

class customComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return new BigDecimal(o1).compareTo(new BigDecimal(o2));
    }
}

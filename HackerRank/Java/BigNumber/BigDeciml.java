package Java.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
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
//        BigDecimal bd[] = new BigDecimal[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
//        for(int i=n-1;i>=0;i--)
//        {
//            System.out.println(s[i]);
//        }

        //Write your code here

//        Arrays.sort( s, (as,bs) -> {BigDecimal bd = new BigDecimal(bs);
//            return bd.compareTo(new BigDecimal(as));} );

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b1 =  new BigDecimal(o1);
                BigDecimal b2 =  new BigDecimal(o2);
//        if(b1==b2)
//            return 0;
                return b1.compareTo(b2);
            }
        });

        


        //Output
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }

    }

}

import java.util.*;
public class MyClass {
    public static void main(String args[])
    {
        int[] a = {1 , 4 , 5 , 3 , 6 , 4};
        
        System.out.println(maxProduct(a));
    }
    static int maxProduct(int[] a)
    {
        int firstMax = 0 , secondMax = 0 , n = a.length;
        for(int i = 0 ; i < n ; i++)
            if(a[i] > firstMax)
            {
                secondMax = firstMax;
                firstMax = a[i];
            }
            else if(a[i] > secondMax)
                secondMax = a[i];
        return (firstMax - 1) * (secondMax - 1);
    }
}
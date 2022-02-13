import java.util.*;
public class MyClass {
    public static void main(String args[])
    {
        int[] a = {1 , 4 , 5 , 3 , 6 , 2};
        sort(a);
    }
    public static void sort(int [] x)
    {
        Arrays.sort(x);
        for (int i=0; i<=x.length-1; i++)
        {
            System.out.println(x[i]);
        }
    }
}
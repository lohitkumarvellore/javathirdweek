import java.util.*;
public class MyClass {
    public static void main(String args[])
    {
        int[] a = {1 , 4 , 5 , 3 , 6 , 4};
        reverse(a);
    }
    public static void reverse(int [] x)
    {
        for (int i=x.length-1; i>=0; i--)
        {
            System.out.println(x[i]);
        }
    }
}
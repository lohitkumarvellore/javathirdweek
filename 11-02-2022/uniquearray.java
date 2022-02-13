import java.util.*;
public class MyClass {
    public static void main(String args[])
    {
        int[] a = {1 , 4 , 5 , 3 , 6 , 2};
        
        //System.out.println(duplicates(a));
        boolean flag = duplicates(a);
        if(flag)
        {
            System.out.println("not unique");
        }
        else
        {
            System.out.println("unique");
        }
    }
    public static boolean duplicates (int [] x){
    for (int i=0; i<x.length; i++){
        for (int j=i+1; j<x.length; j++){
            if (x[j]==x[i]) return true;
        }
    }
    return false;
}
}
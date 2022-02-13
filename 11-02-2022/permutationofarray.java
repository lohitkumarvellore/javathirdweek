import java.util.*;
public class MyClass {
    public static void main(String args[])
    {
        int[] a = {1 , 4 , 5 , 3 , 6 , 2};
        int[] b = {1 , 5 , 3 , 2 , 7 , 4};
        
        //System.out.println(duplicates(a));
        boolean flag = checkPermutation(a,b);
        if(flag)
        {
            System.out.println("permuatations of each other");
        }
        else
        {
            System.out.println("not permutations of each other");
        }
    }
    
    static boolean checkPermutation(int[] array1, int[] array2){

     if (array1.length != array2.length)
        return false;
        
     Arrays.sort(array1);
     Arrays.sort(array2);

     for(int i = 0; i  <  array1.length; i++){
           if(array1[i] != array2[i])
              return false;       
     }
     
     return true;
    }
}

public class MyClass {
    public static void main(String args[])
    {
        int[] b = {1 , 4 , 5 , 3 , 6 , 2};
        middle(b);
        
    }
    
    static void middle(int[] array1){

     if (array1.length <= 2)
        System.out.println("no middle number");
        
     for(int i = 1; i  <  array1.length-1; i++){
        System.out.println(array1[i]);          
     }
     
    }
}
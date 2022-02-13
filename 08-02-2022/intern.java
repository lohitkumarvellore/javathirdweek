import java.util.*;
public class MyClass {
    
    public static void main(String[] args)
    {
     	 String str1=new String("String1");  
	        String str2="String1";  
	        String str3=str1.intern();  
	        System.out.println(str1==str2);  
	        System.out.println(str2==str3);  
	        
        
    }
}
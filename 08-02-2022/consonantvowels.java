import java.util.*;
public class MyClass {
    public static void consonantvowel(String str)
	    {
	        int vowels = 0, consonant = 0; 
	        for (int i = 0; i < str.length(); i++) 
		{	              
	            char ch = str.charAt(i);
	            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
		    {
	                ch = Character.toLowerCase(ch);
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	                    vowels++;
	                else
	                    consonant++;
	            }	        
		}  
	        System.out.println(vowels +":" + consonant);
	    }

    public static void main(String[] args)
    {
     	 String str = "hello";
	    consonantvowel(str);
        
    }
}
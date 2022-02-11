import java.util.Scanner;
public class Equalstringsornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String a = sc.nextLine();
        System.out.println("enter second string");
        String b = sc.nextLine();
        if(a.equals(b))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}

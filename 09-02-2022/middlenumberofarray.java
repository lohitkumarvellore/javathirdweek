import java.util.Scanner;
public class middlenumberofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("enter numbers");
        for(int i=0;i<a.length ;i++)
        {
            a[i]=sc.nextInt();
        }
        int middlenumber = 0;
        middlenumber = a.length/2;
        if(a.length%2 == 0)
            System.out.println(a[middlenumber-1]);
        else
            System.out.println(a[middlenumber]);
    }
}

import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("enter 10 numbers");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

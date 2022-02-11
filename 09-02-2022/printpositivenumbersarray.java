import java.util.Scanner;
public class printpositivenumbersarray {
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
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                System.out.println(a[i]);
            }
        }
    }
}

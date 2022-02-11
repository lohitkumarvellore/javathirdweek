import java.util.Scanner;
public class highestoccuringchar {
    public static void main(String[] args) {
        String maxOccStr;
        char maxChar = ' ';
        int i, max = -1;
        int[] charREP = new int[256];

        Scanner sc= new Scanner(System.in);

        System.out.print("\nEnter String: ");
        maxOccStr = sc.nextLine();

        for(i = 0; i < maxOccStr.length(); i++)
        {
            charREP[maxOccStr.charAt(i)]++;
        }
        for(i = 0; i < maxOccStr.length(); i++)
        {
            char ch = maxOccStr.charAt(i);
            if(max < charREP[ch]) {
                max = charREP[ch];
                maxChar = ch;
            }
        }
        System.out.println("\n Highest Occurring Character = '"+ maxChar+"'");
    }
}
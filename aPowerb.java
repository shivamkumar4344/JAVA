import java.util.Scanner;
public class aPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int ogB = b;
        int ogA = a;
        int ans = 1;
        for(int i =1;i<=b;i++)
        {
            ans = ans * a;
        }
        System.out.println(ogA+" to the power "+ogB +" is "+ ans);
    }

}

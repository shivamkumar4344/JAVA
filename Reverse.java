import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ogN = n;
        int rev = 0;
        while(n!=0)
        {
            int last_dig = n%10;
            rev = rev*10 + last_dig;
            n=n/10;
        }
        System.out.println("Reverse of "+ogN+" is "+ rev);
    }
}

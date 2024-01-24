import java.util.Scanner;
public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;
        int ogN = n;

        while(n != 0)
        {
            int last = n % 10;
            rev = rev * 10 + last;
            n/=10;
        }
        System.out.println("Reverse of the number " +ogN+" is "+rev );
    }
}

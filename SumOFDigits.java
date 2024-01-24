import java.util.Scanner;
public class SumOFDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ogN = n;

        int sum = 0;

        while(n > 0)
        {
            int last = n % 10;
            sum+=last;
            n = n/10;
        }
        System.out.println("sum of the digits "+ ogN+ " is "+ sum);
    }
}

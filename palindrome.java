// palindrome number
import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        int ogN = n;
        int rev = 0;
        while(n!=0)
        {
            int last = n%10;
            rev = rev*10 + last;
            n=n/10;
        }

        if(ogN==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
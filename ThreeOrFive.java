//Write a program to print the value if it is divisible by 3 or 5
import java.util.Scanner;
public class ThreeOrFive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num % 3 == 0 || num % 5 == 0)
        {
            System.out.println("Divided by 3 or 5");
        }
        else{
            System.out.print("Not Divided by 3 or 5");
        }
    }
}
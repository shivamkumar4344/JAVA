import java.util.Scanner;
public class SumOfStreamNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number first : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != -1)
        {
            System.out.print("Enter the number again : ");
            sum+=num;
            num = sc.nextInt();
        }
        System.out.println("Sum of input numbers are : "+sum);
    }
}

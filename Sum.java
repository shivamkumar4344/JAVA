import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        //with for loop
//        for(int i = 0; i<=n;i++)
//        {
//            sum+=i;
//        }
        //with while loop
        int num = 1;
        while(num<=n)
        {
            sum+=num;
            num++;
        }
        System.out.println("Sum of number from 1 to "+n+" is "+sum);
    }
}

import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = 0;
        int n = sc.nextInt();
        int ogN = n;
        while(n != 0)
        {
            n = n/10;
            count++;
        }
        System.out.println("Number of digits in "+ogN+" is "+count);


    }
}

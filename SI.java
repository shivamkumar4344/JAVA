import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of intrest: ");
        float r = sc.nextFloat();

        System.out.print("Enter time period: ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("Simple Intrest is "+si);
    }

}

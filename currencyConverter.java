import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        float amount = sc.nextFloat();

        System.out.print("Enter the Exchange Rate: ");
        float rate = sc.nextFloat();

        float convert = amount * rate;
        System.out.println("New exchanged amount : "+convert);
    }
}

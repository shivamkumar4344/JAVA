import java.util.Scanner;
public class SumOfArray {
    void SumArrays(int[] arr,int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
           sum+=arr[i];
        }
        System.out.println("Sum:- "+sum);
    }

    void display(int[] arr,int n)
    {
        System.out.println("Array elements are:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfArray arr = new SumOfArray();
        int[] array = new int[5];
        int size = array.length;
        System.out.print("Enetr the array elements : - ");
        for(int i=0;i< size;i++)
        {
            array[i] = sc.nextInt();
        }
        arr.display(array,size);
        System.out.print("\n");
        arr.SumArrays(array,size);
    }
}

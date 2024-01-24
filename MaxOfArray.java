import java.util.*;
public class MaxOfArray {
    void display(int[] arr,int n)
    {
        System.out.println("Array elements are:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void Max(int[] arr,int n)
    {
        int ans = arr[0];
        for(int i=0;i<n;i++)
        {
            if(ans<arr[i])
            {
                ans = arr[i];
            }
        }
        System.out.println("Max:- "+ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxOfArray arr = new MaxOfArray();
        int[] array = new int[5];
        int size = array.length;
        System.out.print("Enter the array elements : - ");
        for(int i=0;i< size;i++)
        {
            array[i] = sc.nextInt();
        }
        arr.Max(array,size);
    }
}

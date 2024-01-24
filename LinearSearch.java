import java.util.Scanner;
public class LinearSearch {
    void LinearSearch(int[] arr,int n,int target)
    {
        int ans = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                ans = i;
                break;
            }
        }
        System.out.println(target+" is found at index:- "+ans);
    }
    public static void main(String[] args) {
        LinearSearch l = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int size = array.length;
        System.out.print("Enter the array elements : - ");
        for(int i=0;i< size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search:- ");
        int target = sc.nextInt();
        l.LinearSearch(array,size,target);

    }
}

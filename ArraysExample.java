import java.util.Scanner;
public class ArraysExample {
    void MultiArray()
    {
        float percent[][] = new float[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the multi-dimensional array elements : - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                percent[i][j] = sc.nextFloat();
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(percent[i][j]);
            }
        }


    }

    void demoArray()
    {
        int ages[] = new int[4];
        ages[0] = 23;
        ages[1] = 4;
        ages[2] = 32;
        ages[3] = 20;
        System.out.println("Array Elements are:- ");
        for(int i=0;i<4;i++)
        {
            System.out.println(ages[i]);
        }

    }
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArray();
        obj.MultiArray();
    }
}

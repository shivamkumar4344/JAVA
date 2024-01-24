import java.util.Scanner;
public class StudentClass {
    public static class Student{
        //user defined data type
        int rno;
        String name;
        String sec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object creation s1
        Student s1 = new Student();
        System.out.println("Enter the name of student 1 : ");
        s1.name = sc.nextLine();
        System.out.println("Enter the section of student 1: ");
        s1.sec = sc.nextLine();


        Student s2 = new Student();
        System.out.println("Enter the name of student 2 : ");
        s2.name = sc.nextLine();
        System.out.println("Enter the section of student 2: ");
        s2.sec = sc.nextLine();

        System.out.println("Enter the roll of student 1: ");
        s1.rno = sc.nextInt();
        System.out.println("Enter the roll of student 2: ");
        s2.rno = sc.nextInt();



        System.out.println("Name of student 1 is "+s1.name);
        System.out.println("Roll number of student 2 is "+s2.rno);
        System.out.println("Section of student 1 is "+s1.sec);
        System.out.println("Name of student 2 is "+s2.name);
        System.out.println("Roll no student 1 is "+s1.rno);

    }
}

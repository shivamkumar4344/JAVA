//use of constructor
public class constructor {
    public static class Hospital{
        int regNo;
        String name;
        double fees;
        String disease;

        public Hospital(int regNo,String name,double fees,String disease)
        {//parameterized constructor
            this.regNo = regNo;
            this.name = name;
            this.fees = fees;
            this.disease = disease;
        }
    }

    public static void main(String[] args) {
        Hospital p1 = new Hospital(101,"Ravi",8700.89,"Typhoid");
        Hospital p2 = new Hospital(201,"Dravid",98987.12,"Dengue");
        System.out.println(p1.regNo);
        System.out.println(p2.fees);
        System.out.println(p2.name);
        System.out.println(p1.fees);
    }
}

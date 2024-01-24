public class StudentClass2 {

    public static class Student
    {
        public String name;
        private int rno;
        double percent;

        public int getRno()
        {
            return rno;
        }

        public void setRno(int rno)
        {
            this.rno = rno;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rno = 12;
        s1.name = "Shivam Yadav";
        s1.percent = 94.8;

        System.out.println(s1.rno);
        s1.setRno(34);
        System.out.println(s1.getRno());
    }
}

public class fraction {
    public static int gcd(int num,int den)
    {
        int min = Math.min(num,den);
        for(int i =min;i>=1;i--)
        {
            if(num%i == 0 && den%i == 0)
            {
                return i;
            }
        }
        return min;
    }
    public static Fraction add(Fraction f1,Fraction f2)
    {
        int numerator = (f1.num*f2.den) + (f2.den*f1.num);
        int denominator = f1.den * f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;
    }

    public static Fraction multiply(Fraction f1,Fraction f2)
    {
        int numerator = f1.num* f2.num;
        int denominator = f1.den* f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;

    }
    public static class Fraction
    {
        int num;
        int den;
        public Fraction(int num,int den)
        {
            this.num = num;
            this.den = den;
            simplyfy();
        }

        void simplyfy()
        {
            int hcf = gcd(num,den);
            num = num/hcf;
            den = den/hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(35,7);
        Fraction f2 = new Fraction(21,9);

        System.out.println("After simplyfying Fraction f1="+f1.num+"/"+f1.den);
        Fraction f3 = add(f1,f2);
        System.out.print("After adding the fraction: ");
        System.out.println(f3.num+"/"+f3.den);
        Fraction f4 = multiply(f1,f2);
        System.out.print("After multiplying the fraction: ");
        System.out.println(f4.num+"/"+ f4.den);

    }
}

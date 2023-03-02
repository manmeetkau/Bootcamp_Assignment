public class quadratic {
    double a;
     double b;
    double c;
    public quadratic(double a,double  b,double c)
    {
        this.a=a;
        this.b=b;
       this.c=c;
    }

    /*public static double getA() {
        return a;
    }

    public static double getB() {
        return b;
    }

    public static  getC() {
        return c;
    }

    public static void setA(int a) {
        a = a;
    }

    public static void setB(int b) {
        b = b;
    }

    public static void setC(int c) {
        c = c;
    }*/
    public void roots(double a,double b,double c)
    {
        double disc=(b*b)-(4*a*c);
        System.out.println(disc);
        if(disc==0){
            System.out.println("disrimainant=0 Equal roots");
            double root1=((-b+Math.sqrt(disc))/(2*a));
            System.out.println("Root1="+root1);
            System.out.println("Root2="+root1);
        }
        else if(disc>0)
        {
            System.out.println("disrimainant>0 Distinct roots");
            double root1=(-b+Math.sqrt(disc)/(2*a));
            double root2=(-b-Math.sqrt(disc)/(2*a));
            System.out.println("Root1="+root1);
            System.out.println("Root2="+root2);
        }
        else
            System.out.println("disrimainant<0 No real roots");
            System.out.println("Complex roots");
    }
    public static void main(String args[])
    {
        quadratic qua=new quadratic(6,2,4);
        qua.roots(qua.a,qua.b,qua.c);

    }
}

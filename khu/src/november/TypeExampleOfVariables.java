package november;

public class TypeExampleOfVariables {

    void m1() {
        // method-level primitive and reference variables
        long l1 = 9010454584L;
        char[] ch = {'h',
        		
        
        'k'};
        TypeExampleOfVariables e2 = new TypeExampleOfVariables();

        System.out.println("Inside m1:");
        System.out.println(l1);
        System.out.println(ch);
        System.out.println(e2);
    }

    void m2() {
        int b = 10;
        int c = 33;

        System.out.println("Inside m2:");
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        // method-level variables inside main()
        int a = 10;
        double d = 20.5;
        String s1 = "hari";

        System.out.println(a);

        TypeExampleOfVariables e1 = new TypeExampleOfVariables();

        // calling methods
        e1.m1();
        e1.m2();

        // ❌ These are errors:
        // System.out.println(b);  // ERROR (b defined only in m2)
        // System.out.println(e2); // ERROR (e2 defined only in m1)
    }
}

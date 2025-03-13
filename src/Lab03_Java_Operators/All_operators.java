package Lab03_Java_Operators;

public class All_operators {
    public static void main(String[] args) {
        int a=30 , b= 40;

        // Assignment operators

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(b/a);
        System.out.println("a+b");

        // unary operators
        System.out.println("Unary Operators");
        int c= +10 , d= -12;
        int result = c+d;
        System.out.println(c);
        System.out.println(d);
        System.out.println(result);

        // relational operators
        System.out.println("Relationtional Operators");
        boolean B1=  a>b;
        System.out.println(B1);
        int my_age=30 , amit_age= 40;
        boolean b2= my_age>=amit_age;
        System.out.println(b2);


    }
}

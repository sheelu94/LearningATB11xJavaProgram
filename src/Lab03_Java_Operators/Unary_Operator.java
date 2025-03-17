package Lab03_Java_Operators;

public class Unary_Operator {
    public static void main(String[] args) {
        int a= +10 , b= -12;
        int result = a+b;
        System.out.println(a); //10
        System.out.println(b); //-12
        System.out.println(a+b); //-2
//        System.out.println(++a); // 11
//         System.out.println(a++);  //11
//        System.out.println(++b);  // -11
//      System.out.println(b++); //-11
//        System.out.println(+a); //12
//       System.out.println(++b);
        System.out.println(++a + ++a); //23
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b++ + b++);


    }


}

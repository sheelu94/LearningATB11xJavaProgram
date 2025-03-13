package Lab03_Java_Operators;

public class Concat_exmp {
    public static void main(String[] args) {
        int a= 200, b= 500;
        System.out.println(a+b);  // math

        String fn= "Sheelu";
        String ln= "Sharma";
        System.out.println(fn+ln);

        /// Concatination with string and integer
        System.out.println(fn + ln + a + b);  // sheelusharma200500
        System.out.println(a + b + fn + ln);   // 700sheelusharma
        System.out.println(fn+ln +(a+b));  // sheelusharma700


    }
}

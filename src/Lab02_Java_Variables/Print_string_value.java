package Lab02_Java_Variables;

public class Print_string_value {
    public static void main(String[] args) {
        String fn= "Sheelu";
        String mn="Kumari" ;
        String ln= "Sharma";
        System.out.println(fn);
        System.out.println(mn);
        System.out.println(ln);
        System.out.println("My first name is :" +fn);
        System.out.println("my middle name is :" +mn);
        System.out.println("my last name is :" +ln);
        System.out.printf("First name using printf  : %s%n ", fn);
        System.out.printf("Last name using printf : %s%n ", ln);
        System.out.println("My complelte name :" +fn+" "+mn+" "+ln); // Concat String with space
        System.out.printf("Sheelu kumari Sharma %n ");
        System.out.println("sheelu kumari sharma" );
        System.out.printf("%s %s %s%n ", fn , mn, ln );


    }
}

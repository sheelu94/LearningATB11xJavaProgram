package Lab02_Java_Variables;

public class Ex02_Printf {
    public static void main(String[] args) {
        String name= "Sheelu";
        int age= 30;
      // System.out.println("my name is :" %s name);
        //System.out.println("Age :%d%n", age); // this is incorrct because println does not support format specifier like %d
        System.out.printf("my Age is : %d%n", age); // Here printf will work
        System.out.println("My Age is :" +age); // this will also work without formatting also
        System.out.printf("my name is : %s %n", name);
        System.out.println("My another name is :"+  name);  //stirng print wihtut formating
    }
}

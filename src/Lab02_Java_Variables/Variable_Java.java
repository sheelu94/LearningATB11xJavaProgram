package Lab02_Java_Variables;

public class Variable_Java {
    public static void main(String[] args) {
        String name= "Sheelu";
        int Age= 30;
        int salary= 300000;          // varibale declaration and assignment together
        int $yt= 34;

      //  int 5yt= 34;               // this will give an error
        int myNum;              // Variable declare first then assign
        myNum=5000;              // varibale assignment
        myNum=1000;    // here if sdiff value assigning to a varibale then it will override to privous one
        System.out.println(name);
        System.out.println(Age);
        System.out.println(salary);
        System.out.println(myNum);
    }
}

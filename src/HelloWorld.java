import java.util.Scanner;

public class HelloWorld {
/*
    public static String getName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String placeholder = scan.next();


        return placeholder;
    }

    public static void greet(){
        System.out.println("Hello " + getName());
    }
 */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println(name);
        //greet();
        /*
        for(String a : args){
            System.out.println(a);
        }
         */
    }
}



//modules
//packages
//class
//methods
// ^ ^ ^    Heirarchy
//"I want a program that asks a person's name and greets them"
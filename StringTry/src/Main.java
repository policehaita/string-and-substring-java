//Check if a String Ends with “.com”
import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        String name1 = "www.google.com" ;
        System.out.println(name1);

        System.out.println("Does it end with '.com' ?");

        if (name1.endsWith(".com")){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

        //Convert to Uppercase and Lowercase

        Scanner scanner = new Scanner(System.in);

        String name2 = "Manish";
        System.out.println("What is your name?");
        name2 = scanner.next();

        System.out.println("Lowercase: " +name2.toLowerCase());
        System.out.println("Uppercase: " +name2.toUpperCase());

        //Finding First and last character

        System.out.println("Enter your Home name:");
        String name3 = scanner.next();

        System.out.println("Its length is: " +name3.length());
        System.out.println("It starts with: " +name3.charAt(0));
        System.out.println("It ends with: " +name3.charAt(name3.length() -1));

        //Finding position

        System.out.println("Enter you favourite animal:");
        String name4 = scanner.next();

        System.out.println("Position of 'a' is at :" +name4.indexOf('a'));

        System.out.println("Enter Your Father Name:");
        String fname = scanner.next();

            System.out.println("Your father name is: " +fname);

        String mname = "";
        System.out.println("Your mother name is empty " +mname.isEmpty());

        String sname = "Sister";
        System.out.println("Does your Sister name contain 'i' ?");
        if (sname.contains("i")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");

        }


        scanner.close();



    }
}

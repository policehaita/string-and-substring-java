import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        String email = "manishsubedi1@gmail.com";
        String username = email.substring(0,13);
        String domain = email.substring(13);

        System.out.println("Your username is: " +username);
        System.out.println("Your domain is: " +domain);

        //alternate way

        String email1 = "subedimanish123@gmail.com";
        String username1 = email1.substring(0,email1.indexOf("@"));
        String domain1 = email1.substring(email1.indexOf("@"));

        System.out.println("Your username is: " +username1);
        System.out.println("Your domain is: " +domain1);

        // importing from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your email: ");
        String email2 = scanner.nextLine();

        if (email2.contains("@")){
            String username2 = email2.substring(0,email2.indexOf("@"));
            String domain2 = email2.substring(email2.indexOf("@"));

            System.out.println("Your username is: " +username2);
            System.out.println("Your domain is: " +domain2);
        }
        else {
            System.out.println("please enter valid email which contains @");
        }
        scanner.close();
    }
}

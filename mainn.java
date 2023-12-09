import java.util.Objects;
import java.util.Scanner;
public class mainn {
    public static void main(String[]args){
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your Firstname:");
            String Firstname = scanner.nextLine();

            System.out.println("Enter your Lastname:");
            String Lastname = scanner.nextLine();

            System.out.println("Enter a username:");
            String username = scanner.nextLine();

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            System.out.println("Confirm your password:");
            String Confirmpassword = scanner.nextLine();

            if (!Objects.equals(password, Confirmpassword)){

                System.out.println("Your password doesn't match , TRY AGAIN");

            }

            System.out.println("Enter your profilePictureUrl:");
            String profilePictureUrl = scanner.nextLine();

            System.out.println("Enter your Birtdate:");
            Date Birthdate = scanner.nextLine();


        }

    }

}

import java.util.Scanner;
public class Lab11B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.next();
        boolean length = false;
        boolean uppercase = false;
        boolean digit = false;

        if(password.length() >= 8){
            length = true;
            for(int i = 0; i < password.length(); i++){
                if(password.codePointAt(i) >= 65 && password.codePointAt(i)<= 90) {
                    uppercase = true;
                }
                if(password.codePointAt(i) >= 48 && password.codePointAt(i) <= 57){
                    digit = true;
                }
            }
        }

        if(length && uppercase && digit){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
        System.out.println("\nProgram Ends");
    }
}
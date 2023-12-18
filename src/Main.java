import java.util.Scanner;
public class PasswordChecker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        String password;
        String current;
        boolean done1 = true;
        boolean tf;
        do {
            count = 0;
            tf = false;
            System.out.println("Please enter your password: ");
            password = scan.nextLine();
            if (password.length() >= 12){
                count ++;
            } else{
                System.out.println("Your password should be at least 12 characters long.");
            }
            for(int i = 0; i < password.length(); i++ ) {
                current = password.substring(i, i + 1);
                if (current.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]")) {
                    tf = true;
                }
            }
            if (tf){
                count++;
            } else{
                System.out.println("Your password should contain an uppercase letter.");
            }

            tf = false;

            for(int i = 0; i < password.length(); i++ ) {
                current = password.substring(i, i + 1);
                if (current.matches("[abcdefghijklmnopqrstuvwxyz]")) {
                    tf = true;
                }
            }
            if (tf ){
                count++;
            } else{
                System.out.println("Your password should contain a lowercase letter.");
            }
            tf = false;

            for(int i = 0; i < password.length(); i++ ) {
                current = password.substring(i, i + 1);
                if (current.matches("[0123456789]")) {
                    tf = true;
                }
            }
            if (tf){
                count++;
            } else{
                System.out.println("Your password should contain a number.");
            }

            tf = false;

            for(int i = 0; i < password.length(); i++ ) {
                current = password.substring(i, i + 1);
                if (current.matches("[!#$%]")) {
                    tf = true;
                }
            }
            if (tf){
                count++;
            } else{
                System.out.println("Your password should contain a special character letter.");
            }
            System.out.println("Your password passed " + count + "/5 tests.");
            if (count>3){
                System.out.println("Your password's strength is strong.");
            } else if (count == 3){
                System.out.println("Your password's strength is medium.");
            } else{
                System.out.println("Your password's strength is weak.");
            }
            if (!InputHelper.getYNConfirm(scan, "Would you like to try again [Y/N]")){
                done1 = false;
            }
        } while (done1);
    }
}
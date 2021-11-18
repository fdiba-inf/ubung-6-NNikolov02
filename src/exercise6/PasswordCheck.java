package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       boolean isValid = true;
       
       do{
         String password = input.nextLine();
         if (password.length() < 8){
         isValid = false; 
         }
       
       for(int i = 0;i < password.length();i++){
       if (!(Character.isLetterOrDigit(password.charAt(i)))){
         isValid = false;
         break;
       }
       }
         int counter = 0;
         for (int i = 0;i < password.length();i++){
         if (Character.isDigit(password.charAt(i))){
         counter++;
       }
         }
       if (counter < 2){
         isValid = false;
       }
       

       
       






       
       }while (isValid == false);
 System.out.println("Password valid!"); 
    }

}


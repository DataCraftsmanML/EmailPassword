import java.util.Scanner;

public class email{

 public static void main(String args[]){
     
    Scanner scanner = new Scanner(System.in);

    String Email;
    String Password;

    System.out.println("Enter Email Id");
    Email = scanner.nextLine(); 

    System.out.println("Enter Password");
    Password = scanner.nextLine();
    
    if(Email.equals("jiasavaliya@gmail.com") && Password.equals("123456")) {
     
        System.out.println("Sucessfully Login");
    }

    else{

        System.out.println("Login Faild");
    }

 }

}
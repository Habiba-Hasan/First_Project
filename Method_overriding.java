/*
Method Overriding
 */
package method_overriding;
import java.util.Scanner;


    class user{
        void balance(int balance){
            System.out.println("This balance is: "+balance);
        }
    }

   class bank_officer extends user{
       void balance(int balance)
       {
           int choice;
           System.out.println("Enter 1 to check and 2 for update balance");
           Scanner sc= new Scanner(System.in);
           choice= sc.nextInt();
           if(choice==1){
               System.out.println("The balance is: "+balance);
           }
           
           if(choice==2){
               int updt;
               System.out.println("Enter the amount of update");
                 updt=sc.nextInt();
               balance=balance+updt;
               System.out.println("The updated balance is: "+balance);
           }
       }
   }
public class Method_overriding {
    public static void main(String[] args) {
        user obj1= new user();
        obj1.balance(3000);
        bank_officer obj2= new bank_officer();
        obj2.balance(3000);
        
    }
    
}

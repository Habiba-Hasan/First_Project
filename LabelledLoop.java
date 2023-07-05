/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelledloop;
import java.util.Scanner;

public class LabelledLoop {

    public static void main(String[] args) {
        int flag=0;
        System.out.println("Enter Any Value: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        outloop: for(int i=2; i<=n; i++)
        {
            if (n%i==0)
                flag++;
            break outloop;
        }
        
        if(flag==0)
        {
            System.out.println("Prime");
        }
        
        if(flag==1)
        {
           System.out.println("Not Prime");
        }
    }
}

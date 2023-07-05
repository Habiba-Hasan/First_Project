
/*Method Overloading*/
package method_overloading;
class a{
    /*int x,y;
    String z;
    a(int a, String b, int c){
        this.x=a;
        this.y=c;
        this.z=b;
    
}*/
   void payment(int ac_no, int pin_no)
    {
       System.out.println("Mobile Banking payment successfull"); 
       
    }
          void payment(int ac_no, int pin_no, int routing_no)
    {
        System.out.println("Bank payment successfull");

    }
}
    public class Method_overloading {
        
    public static void main(String[] args) {
       a obj= new a ();
       obj.payment(56789, 1234);
       obj.payment(56789, 1234, 8080);
     
    }
    
 }

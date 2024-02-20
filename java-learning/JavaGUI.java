import  javax.swing.JOptionPane;
import java.util.Scanner;

public class JavaGUI
{
    static class Constructor{

        Constructor(String x) {
            System.out.println("Helllo " + x);
        }

         public Constructor() {
            System.out.println("aloo this is parent constructor");
         }
     }
   static class  Child extends Constructor{
         Child(){


             System.out.println("this is child");
         }
         Child(String x){
             super(x);
             System.out.println("this is parameter child" + x );
         }
         public void AddSub(int x, int y){

             System.out.print("total of value is : ");
             System.out.println(x+y);
         }

    }

    public static void main(String[] args){
//         JavaGUI java = new JavaGUI() ;
        int x,y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x =sc.nextInt();
        System.out.println(("Enter the value of y"));
        y = sc.nextInt();
         Child child = new Child();
         Child childparameter = new Child("hello");
         child.AddSub(x,y);
    }
}

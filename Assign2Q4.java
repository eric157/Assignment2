package MyPackage;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Assign2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of test Cases"));
        for(int i =0 ;i<=n;i++)
        {
            if ( i != 0){
                System.out.println("\nEnter Next Values Now");
            }
            System.out.println("Enter Number 1");
            int num1 = sc.nextInt();
            System.out.println("Enter Number 2");
            int num2 = sc.nextInt();
            System.out.println("Sum:"+(num1+num2));
        }
    }
}

package MyPackage;
import javax.swing.JOptionPane;
public class Assign2Q3 {
    public static void main(String[] args) {
        double m1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks of Subject 1"));
        double m2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks of Subject 2"));
        double m3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks of Subject 3"));
        double total = m1 + m2 + m3 ;
        double per = (m1 + m2 + m3)/3;
        System.out.println("Total Marks:"+total+"\tPercentage:"+per);
    }
}

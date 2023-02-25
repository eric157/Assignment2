package MyPackage;
import javax.swing.JOptionPane;
public class Assign2Q1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Enter your Details");
        String name = JOptionPane.showInputDialog(null,"Enter Your name");
        int roll_no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Roll no"));
        String field = JOptionPane.showInputDialog(null,"Enter Your Field Of Interest");
        System.out.println("Name:"+name+"\tRoll No:"+roll_no+"\nField of Interest:"+field);
    }
}

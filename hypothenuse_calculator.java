import javax.swing.*;

public class hypothenuse_calculator {
    public static void main(String[] args) {

        while (true) {
            int a = 0;
            int b = 0;


            a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));

            double c = Math.sqrt(a*a + b*b);



            JOptionPane.showMessageDialog(null, "The hypothenuse is: " + c);

        }
    }
}

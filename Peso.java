import javax.swing.JOptionPane;

public class Peso {
   public static void main (String [] args){
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Quanto você pesa?"));
      
      JOptionPane.showMessageDialog(null, "Sua massa é de " + peso + "kg");
   }
}
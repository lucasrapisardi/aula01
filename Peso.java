import javax.swing.JOptionPane;

public class Peso {
   public static void main (String [] args){
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Quanto voc� pesa?"));
      
      JOptionPane.showMessageDialog(null, "Sua massa � de " + peso + "kg");
   }
}
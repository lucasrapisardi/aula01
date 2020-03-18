import javax.swing.JOptionPane;

public class LePalavra {
   public static void main (String [] args){
      //declaração de variáveis
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra");
      
      JOptionPane.showMessageDialog(null, palavra3 + " " + palavra2 + " " + palavra1);
   }
}
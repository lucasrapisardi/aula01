import javax.swing.JOptionPane;

public class LeNumeroInteiro{
   public static void main(String [] args){
      //declaração de variáveis
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
      JOptionPane.showMessageDialog(null, "O valor do número digitago é: " + numero);
   }
}
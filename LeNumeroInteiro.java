import javax.swing.JOptionPane;

public class LeNumeroInteiro{
   public static void main(String [] args){
      //declara��o de vari�veis
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      JOptionPane.showMessageDialog(null, "O valor do n�mero digitago �: " + numero);
   }
}
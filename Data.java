import javax.swing.JOptionPane;

public class Data{
   public static void main(String [] args){
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o dia no formato dd"));
      int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o m�s no formato mm"));
      int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o ano no formado aaaa"));
      
      JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
   }
}
import javax.swing.JOptionPane;
public class exercicio2 {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("digite a nota"));
            if (nota >= 100) 
            JOptionPane.showMessageDialog(null, "invalida");
            else if (nota >= 70) {
            JOptionPane.showMessageDialog(null,"aprovado");
            }
        else {
            JOptionPane.showMessageDialog(null,"aprovado");
            }
        }    
}


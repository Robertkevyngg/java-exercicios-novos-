import javax.swing.JOptionPane;
public class exercicio1 {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("digite a nota"));
        if (nota>= 70) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }    
    }
}

import javax.swing.JOptionPane;
public class exercicio3 {
    public static void main(String[] args) {double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digitea nota"));
        if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "Parabéns");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else {
            if (nota >= 80) {

                JOptionPane.showMessageDialog(null, "Conceito B");

            }

            else {

                if (nota >= 70) {

                    JOptionPane.showMessageDialog(null, "Conceito C");
}
else {
JOptionPane.showMessageDialog(null, "Reprovado");
}
}
}
}
}

import javax.swing.JOptionPane;
public class Calculadora { 
    
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(num2);

        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return;
        }

        JOptionPane.showMessageDialog(null, numero1 + " " + operacao + " " + numero2 + " = " + resultado); 
    }
} 

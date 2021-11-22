package ImparPar;
import javax.swing.JOptionPane;

public class ParoImpar {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un segundo numero: "));
        
        if (num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null,"Ambos son números pares");
        }
        else if (num1%2==0 && num2%2>=1){
            JOptionPane.showMessageDialog(null,+num1 +" Es par, PERO: "+num2+ " Es impar");
        }
        else if (num1%2>=1 && num2%2==0){
            JOptionPane.showMessageDialog(null,+num1 +" Es impar, PERO: "+num2+ " Es par");            
        }
        else {
            JOptionPane.showMessageDialog(null,+num1 + " y "+num2+ " son impares");            
        }
    }
}
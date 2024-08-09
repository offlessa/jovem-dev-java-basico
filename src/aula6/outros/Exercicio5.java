package aula6.outros;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int circunferencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a circunferência do círculo: "));
        BigDecimal raio = calcularRaio(circunferencia);
        JOptionPane.showMessageDialog(null, "O raio do círculo é: " + raio);
    }

    public static BigDecimal calcularRaio(int circunferencia) {
        BigDecimal C = new BigDecimal(circunferencia);
        BigDecimal PI = new BigDecimal(Math.PI);
        BigDecimal doisPi = PI.multiply(BigDecimal.valueOf(2));
        BigDecimal raio = C.divide(doisPi, MathContext.DECIMAL128);
        return raio.setScale(4, RoundingMode.HALF_EVEN);
    }
}

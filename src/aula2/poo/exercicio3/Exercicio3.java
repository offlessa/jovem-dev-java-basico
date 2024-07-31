package aula2.poo.exercicio3;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;

public class Exercicio3 {

	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String data = JOptionPane.showInputDialog(null, "Digite uma data no formato dd/MM/yyyy:");

		try {

			LocalDate date = LocalDate.parse(data, formato);
			DayOfWeek diaDaSemana = date.getDayOfWeek();
			String diaDaSemanaEmIngles = diaDaSemana.name();

			JOptionPane.showMessageDialog(null, "O dia da semana é: " + diaDaSemanaEmIngles);
		} catch (DateTimeParseException e) {

		}
	}
}
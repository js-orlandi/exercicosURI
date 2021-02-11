import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		double valorHora;
		
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", (horasTrabalhadas * valorHora));
		
      sc.close();
	}

}

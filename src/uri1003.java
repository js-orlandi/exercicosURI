import java.util.Locale;
import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
     
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);

   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   
   int soma = num1 + num2;
   
   System.out.println("SOMA = " + soma);
   
   sc.close();
	}

}

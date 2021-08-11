import java.util.Scanner;

public class validarEmail {

	public static void main(String[] args) {

		String email = null;
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o deu email: ");
				
		email = scan.nextLine();
		a = email.indexOf('@');
		b = email.indexOf('.');
		c = email.length();

		if (a > 0) {
			if (b - a != 1) {
				if (b != c - 1)
					System.out.println("Email valido");
				else
					System.out.println("Email invalido");
			} else
				System.out.println("Email invalido");

		} else
			System.out.println("Email invalido");
	}
}
package a;

import java.util.Locale;
import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner xr = new Scanner(System.in);
	   	Locale.setDefault(Locale.US);

		 System.out.println(" Digite seu nome de usuário:  ");
			String usuario = xr.next();
			System.out.println(" Digite sua Senha ");
			String senha = xr.next();
			if (usuario.equals("Liverpool") && senha.equals("YNWA")) {
				System.out.println(" Login bem-sucedido");
			} else {
				System.out.println(" Usuário ou senha Incorretos");
			}

xr.close();
	}

}

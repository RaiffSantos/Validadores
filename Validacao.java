package exercicios;

import java.util.Scanner;

public class Validacao {

	public static void main(String [] args){
		
		Scanner ler = new Scanner(System.in);
		
		Validate validar = new Validate();
		
		System.out.println("Informe seu CPF");
		String cpf = ler.nextLine();
		validar.validarCPF(cpf);
		
		System.out.println("Informe seu CNPJ");
		String cnpj = ler.nextLine();
		validar.validarCNPJ(cnpj);
		
	}
	
}

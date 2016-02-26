package exercicios;

import java.util.Scanner;

public class ValidacaoCPF {

	public static void main(String [] args){
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o seu CPF");
		String cpf = ler.nextLine();

		
		int[] arrayCPF = new int[20];
		
		int i = 0;
		int calc1 = 0;
		int calc2 = 0;
		int cont1 = 10;
		int cont2 = 11;
		int primeiroDigito;
		int segundoDigito;
		
        //instancia o array com o cpf
		for(i = 0; i < 11; i++){
			arrayCPF[i] = (int)cpf.charAt(i) - 48;
		}
		
        //calculo do primeiro digito verificador
		for(i = 0; i < 9; i++){
			calc1 =  calc1 + (arrayCPF[i] * cont1);
			cont1--;
		}
		primeiroDigito = 11 - (calc1 % 11);
		if(primeiroDigito < 2){
			primeiroDigito = 0;
		}
		
        //calculo do segundo digito verificador
		for(i = 0; i < 10; i++){
			calc2 = calc2 + (arrayCPF[i] * cont2);
			cont2--;
		}
		segundoDigito = 11 - (calc2 % 11);
		if(segundoDigito < 2){
			segundoDigito = 0;
		}
		
		
		if(primeiroDigito == arrayCPF[9] && segundoDigito == arrayCPF[10]){
			System.out.println("CPF válido!");
		}else{
			System.out.println("CPF inválido!");
		}
		
		
	}
	
}

package exercicios;

public class Validate {

	public void validarCPF(String cpf){
		
		int i = 0;
		int calc1 = 0;
		int calc2 = 0;
		int cont1 = 10;
		int cont2 = 11;
		int primeiroDigito;
		int segundoDigito;
		int regist = 0;
		
		//Verifica se todos os digitos são iguais
		for(i = 0; i < 10; i++){
			if((cpf.charAt(0) - 48) == (cpf.charAt(i) - 48)){
				regist++;
			}
		}
		
		if(regist <= 9){
		
                    //Calculo do primeiro digito verificador		
		    for(i = 0; i < 9; i++){
			    calc1 = calc1 + ((cpf.charAt(i) - 48) * cont1);
			    cont1--;
		    }
		
		    primeiroDigito = calc1 % 11;
		    if(primeiroDigito < 2){
			    primeiroDigito = 0;
		    }else{
			    primeiroDigito = 11 - primeiroDigito;
		    }

		    if(primeiroDigito == (cpf.charAt(9) - 48)){
			
                        //Calculo do segundo digito verificador
		        for(i = 0; i < 10; i++){
			        calc2 = calc2 + ((cpf.charAt(i) - 48) * cont2);
			        cont2--;
		        }
		
		        segundoDigito = calc2 % 11;
		        if(segundoDigito < 2){
			        segundoDigito = 0;
		        }else{
			        segundoDigito = 11 - segundoDigito;
		        }

		        if(segundoDigito == (cpf.charAt(10) - 48)){
			        System.out.println("CPF válido!");
		        }else{
		        	System.out.println("CPF inválido!");
		        }
		
	    	    }else{
		        System.out.println("CPF inválido!");
		    }
		}else{
		    System.out.println("CPF inválido!");
		}
		
	}
	
	
	
	public void validarCNPJ(String cnpj){
		
	    int[] calcCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4 ,3 ,2};
	    int[] arrayCNPJ = new int[14];
		
	    int i = 0;
	    int calc1 = 0;
	    int calc2 = 0;
	    int cont1 = 1;
	    int primeiroDigito;
	    int segundoDigito;
	    
	    
	    //Instancia array com o CNPJ
	    for(i = 0; i < 14; i++){
	    	arrayCNPJ[i] = (int)cnpj.charAt(i) - 48;
	    }
	    
	    
	    //Calculo do primeiro digito verificador
	    for(i = 0; i < 12; i++){
	    	calc1 = calc1 + (arrayCNPJ[i] * calcCNPJ[cont1]);
	    	cont1++;
	    }
		primeiroDigito = calc1 % 11;
		if(primeiroDigito < 2){
			primeiroDigito = 0;
		}else{
			primeiroDigito = 11 - primeiroDigito;
		}
	    
		
		//Calculo do segundo digito verificador
		for(i = 0; i < 13; i++){
			calc2 = calc2 + (arrayCNPJ[i] * calcCNPJ[i]);
		}
		segundoDigito = calc2 % 11;
		if(segundoDigito < 2){
			segundoDigito = 0;
		}else{
			segundoDigito = 11 - segundoDigito;
		}
		
		
		if(primeiroDigito == arrayCNPJ[12] && segundoDigito == arrayCNPJ[13]){
			System.out.println("CNPJ válido!");
		}else{
			System.out.println("CNPJ inválido!");
		}
	}
	
}

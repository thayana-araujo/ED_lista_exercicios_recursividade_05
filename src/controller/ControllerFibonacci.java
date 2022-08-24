package controller;

public class ControllerFibonacci {
	
	public ControllerFibonacci(){
		super();
	}
	
	
	public int serieFibonacci(int num) {
		
		
//Se o número de entrada for zero o retorno será 0.				
	    if (num == 0){
            return 0;
        }
//Se o número de entrada for maior que 1, então será verificado se o resto é igual ao 2 numero
	    
		
//Se o número de entrada for 1 ou 2, retorna o número 1
        if (num == 1 || num == 2){
            return 1;
        } else {
//Retorno da série fibonacci (soma do número anterior + o número atual)        	
            return serieFibonacci(num - 1) + serieFibonacci(num - 2);
        }
    }
	}


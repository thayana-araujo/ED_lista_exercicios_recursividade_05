package controller;

public class ControllerFibonacci {
	
	public ControllerFibonacci(){
		super();
	}
	
	
	public int serieFibonacci(int num) {
		
		
//Se o n�mero de entrada for zero o retorno ser� 0.				
	    if (num == 0){
            return 0;
        }
//Se o n�mero de entrada for maior que 1, ent�o ser� verificado se o resto � igual ao 2 numero
	    
		
//Se o n�mero de entrada for 1 ou 2, retorna o n�mero 1
        if (num == 1 || num == 2){
            return 1;
        } else {
//Retorno da s�rie fibonacci (soma do n�mero anterior + o n�mero atual)        	
            return serieFibonacci(num - 1) + serieFibonacci(num - 2);
        }
    }
	}


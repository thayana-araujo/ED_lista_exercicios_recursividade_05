package view;

import javax.swing.JOptionPane;

import controller.ControllerFibonacci;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerFibonacci cf = new ControllerFibonacci();
		
//		variavel que recebe o n�mero para calcular a s�rie
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para calcular a s�rie de Fibonacci "));

		
//Valida��o se o n�mero de entrada � maior que 20				
			    if (num > 20){
		            System.out.println("informe um n�mero at� 20");
		    		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero at� 20 para calcular a s�rie de Fibonacci "));
		        }
		        int result = cf.serieFibonacci(num);
		       
//		exibi��o do resultado
		System.out.println("Resultado da s�rie de Fibonacci: " + result +".");

		        
	}

}

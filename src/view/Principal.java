package view;

import javax.swing.JOptionPane;

import controller.ControllerFibonacci;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerFibonacci cf = new ControllerFibonacci();
		
//		variavel que recebe o número para calcular a série
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular a série de Fibonacci "));

		
//Validação se o número de entrada é maior que 20				
			    if (num > 20){
		            System.out.println("informe um número até 20");
		    		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número até 20 para calcular a série de Fibonacci "));
		        }
		        int result = cf.serieFibonacci(num);
		       
//		exibição do resultado
		System.out.println("Resultado da série de Fibonacci: " + result +".");

		        
	}

}

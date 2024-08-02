package DesafioControleFluxo.src;

import java.util.Scanner;

import DesafioControleFluxo.src.Exception.ParametrosInvalidosException;


public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("");
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}finally{
			terminal.close();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois){
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++){
			if(i == contagem) 
				System.out.print("Imprimindo o número " + i);  
			else
				System.out.print("Imprimindo o número " + i + ", ");  
			    
		}

	}
}
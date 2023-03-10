package sequencia_fibonacci;

import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("       Sequência de Fibonacci    ");
		System.out.println("---------------------------------");
		System.out.println("Esse programa verifica se um número faz ou não parte da sequência de Fibonacci.");
		
		Scanner entrada = new Scanner(System.in);
	
		int valorDeEntrada,valor1, valor2, raiz1, raiz2;
		double quadrado1, quadrado2;
		
		//um número fará parte da sequência de Fibonacci se o resultado
		//de (5 * n^2 -4) ou (5 * n^2 +4) for um quadrado perfeito.
	
		for(int i = 0; i >= 0; i++) {
			
			System.out.println("Digite o número desejado (ou -1 para parar a execução):");
			valorDeEntrada = entrada.nextInt();
			
			if(valorDeEntrada == -1) {
				System.out.println("FIM DA EXECUÇÃO");
				break;
			}
			
			//aplicando a fórmula.
			valor1 = 5 * (valorDeEntrada * valorDeEntrada) + 4;
			valor2 = 5 * (valorDeEntrada * valorDeEntrada) - 4;
				
			//tirando a raíz do resultado obtido com a fórmula.
		    raiz1 = (int) Math.sqrt(valor1);
			raiz2 = (int) Math.sqrt(valor2);
				
			//fazendo o quadrado das raízes obtidas.
			quadrado1 = raiz1 * raiz1;
			quadrado2 = raiz2 * raiz2;
				
			//avaliando se pertence a sequência.
			if(quadrado1 == valor1 || quadrado2 == valor2)
				System.out.println("Pertence a sequência de Fibonacci");
			else
				System.out.println("Não pertence a sequência de Fibonacci");
			
		}
		
		
	}

}

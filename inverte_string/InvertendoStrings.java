package inverte_string;


import java.util.Scanner;

public class InvertendoStrings {

	public static void main(String[] args) {
		
	System.out.println("--------------------------------");
	System.out.println("        PALAVRA INVERSA         ");
	System.out.println("--------------------------------");
	System.out.println("Esse programa coloca a palavra digitada ao contrário!");
	System.out.println("Digite uma palavra: ");
	Scanner entrada = new Scanner(System.in);
	
	String palavra = entrada.next();
	String palavraInversa = "";
	
	 for(int i = palavra.length()-1; i >= 0; i--) {
		 
		 palavraInversa += palavra.charAt(i);
		 
	 }
	 System.out.println(palavraInversa);
	}

}

package main.questao3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Classse desenvolvida para encontrar o número de pares de anagramas de uma
 * palavra.
 * 
 * @author Everton Trennepohl
 */

public class Questao3 {
	
	/**Método principal, responsável por imprimir a mensagem na tela solicitando ao usuário
	 * que digite a palavra. Depois imprime a mensagem com a quantidade de pares de substring
	 * que são anagramas.
	 * 
	 * @param args *-*
	 */
	public static void main(String[] args) {
		
		System.out.println("Digite palavra para saber quantos pares de substring são anagramas: ");
		Scanner scan = new Scanner(System.in);
		int pares = contaParesAnagramas(scan);
		System.out.printf("A palavra tem %d pares de anagramas.", pares);
	}
	
	/**Método que faz a leitura da palavra digitada pelo usuário, divide a palavra em substrings
	 * e verifica a quantidade de pares de anagramas.
	 * 
	 * @param scan - Recebe como parametro um objeto do tipo Scanner
	 * 
	 * @return int - Quantidade de pares de substring que são anagramas.
	 */
	public static int contaParesAnagramas(Scanner scan) {
		
		String palavra = scan.nextLine();
		char[] sb;
		Set<String> lista = new LinkedHashSet<>();
		int cont = 0;
		int tamanho = palavra.length();
		
		if(!verificaPalavra(palavra)) {
			return 0;
		}
		
		for (int i = 0; i < tamanho; i++) {
			sb = palavra.substring(i, i + 1).toCharArray();
			if (!lista.add(new String(sb))) {
				cont++;
			}
		}
		
		for (int i = 0; i < tamanho -1; i++) {
			sb = palavra.substring(i, i + 2).toCharArray();
			Arrays.sort(sb);
			if (!lista.add(new String(sb))) {
				cont++;
			}
		}
		
		for (int i = 0; i < tamanho - 2; i++) {
			sb = palavra.substring(i, i + 3).toCharArray();
			Arrays.sort(sb);
			if (!lista.add(new String(sb))) {
				cont++;
			}
		}
		scan.close();
		return cont;
	}
	
	public static boolean verificaPalavra(String palavra) {
		if(palavra.toLowerCase().matches("[a-z]*")){
			return true;
		}
		return false;
	}
}

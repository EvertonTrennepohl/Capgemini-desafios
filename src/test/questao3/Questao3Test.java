package test.questao3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.Scanner;

import org.junit.jupiter.api.Test;

import static main.questao3.Questao3.verificaPalavra;
import static main.questao3.Questao3.contaParesAnagramas;

/**Classe responsavel por realizar testes na classe Questao3.
 * 
 * @author Everton Trennepohl
 *
 */

class Questao3Test {

	/**Metodo que testa o metodo verificaPalavra passando como parametro um numero.
	 * Retorno esperado false;
	 */
	@Test
	void quandoRecebeNumeroDeveRetornarFalse() {
		assertFalse(verificaPalavra("123"));
	}
	
	/**Metodo que testa o metodo verificaPalavra passando como parametro caracter especial.
	 * Retorno esperado false;
	 */
	@Test
	void quandoRecebeCaracterEspecialDeveRetornarFalse() {
		assertFalse(verificaPalavra("*&"));
	}
	
	/**Metodo que testa o metodo verificaPalavra passando como parametro letras.
	 * Retorno esperado true;
	 */
	@Test
	void quandoRecebeLetrasDeveRetornarTrue() {
		assertTrue(verificaPalavra("abcd"));
	}
	
	/**Metodo que testa o metodo contaParesAnagramas passando como parametro uma letra.
	 * Retorno esperado 0;
	 */
	@Test
	void quandoRecebeApenasUmaLetraRetorna0() {
		String entrada = "a";
		Scanner scan = new Scanner(entrada);
		assertEquals(0, contaParesAnagramas(scan));
		scan.close();
	}
	
	/**Metodo que testa o metodo contaParesAnagramas passando como parametro uma palavra que nao contem anagrama.
	 * Retorno esperado 0;
	 */
	@Test
	void quandoRecebePalavraQueNaoContemParesDeAnagramasRetorna0() {
		String entrada = "abcde";
		Scanner scan = new Scanner(entrada);
		assertEquals(0, contaParesAnagramas(scan));
		scan.close();
	}
	
	/**Metodo que testa o metodo contaParesAnagramas passando como parametro uma palavra que contem 2 pares de anagramas.
	 * Retorno esperado 2;
	 */
	@Test
	void quandoRecebePalavraQueContemDoisParesDeAnagramasRetorna2() {
		String entrada = "ovo";
		Scanner scan = new Scanner(entrada);
		assertEquals(2, contaParesAnagramas(scan));
		scan.close();
	}
	
	/**Metodo que testa o metodo contaParesAnagramas passando como parametro uma palavra que contem 3 pares de anagramas.
	 * Retorno esperado 3;
	 */
	@Test
	void quandoRecebePalavraQueContemTresParesDeAnagramasRetorna3() {
		String entrada = "ifailuhkqq";
		Scanner scan = new Scanner(entrada);
		assertEquals(3, contaParesAnagramas(scan));
		scan.close();
	}

}

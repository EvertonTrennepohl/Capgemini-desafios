package test.questao1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import static main.questao1.Questao1.lerDegraus;

/**Classe responsavel por realizar testes na classe Questao1.
 * 
 * @author Everton Trennepohl
 *
 */
class Questao1Test {

	/**Metodo que testa o metodo lerDegraus passando uma String.
	 * Deve retorna uma mensagem de erro.
	 */
	@Test
	void quandoValorDiferenteDeIntDeveRetornarMenssagemErro() {
		String entrada = "abcd";
		Scanner scan = new Scanner(entrada);
		assertThrows(NoSuchElementException.class, () -> lerDegraus(scan),
				"Valor inv lido! O valor deve ser um inteiro positivo.");
		scan.close();
	}
	
	/**Metodo que testa o metodo lerDegraus passando um valor negativo.
	 * Deve retornar uma mensagem de erro.
	 */
	@Test
	void quandoRecebeValorNegativoDeveRetornarMensagemErro() {
		String entrada = "-10";
		Scanner scan = new Scanner(entrada);
		assertThrows(NoSuchElementException.class, () -> lerDegraus(scan),
				"Valor inv lido! O valor deve ser um inteiro positivo.");
		scan.close();
		
	}
	
	/**Metodo que testa o metodo lerDegraus passando o valor 0.
	 * Deve retornar uma mensagem de erro.
	 */
	@Test
	void quandoRecebeZeroDeveRetornarMensagemDeErro() {
		String entrada = "0";
		Scanner scan = new Scanner(entrada);
		assertThrows(NoSuchElementException.class, () -> lerDegraus(scan),
				"Valor inv lido! O valor deve ser um inteiro positivo.");
		scan.close();
	}
	
	/**Metodo que testa o metodo lerDegraus passando um valor inteiro positivo.
	 * Deve retornar um inteiro positivo.
	 */
	@Test
	void quandoReceberUmInteiroPositivoDeveRetornalo() {
		String entrada = "12";
		Scanner scan = new Scanner(entrada);
		assertEquals(Integer.parseInt(entrada), lerDegraus(scan));
		scan.close();
	}

}

package test.questao2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static main.questao2.Questao2.validaSenha;

/**Classe responsavel por realizar testes na classe Questao2.
 * 
 * @author Everton Trennepohl
 *
 */
class Questao2Test {

	/**
	 * Metodo que testa o metodo validaSenha passando como paramentro uma senha com menos de seis caracteres.
	 * Retorno esperado false.
	 */
	@Test
	void quandoRecebeStringComMenosDeSeisCaracteresRetornaFalse() {
		String entrada = "Ab12*";
		assertFalse(validaSenha(entrada), "Senha fraca! Adicione mais " + (6 - entrada.length()) + " caracteres.");
	}
	
	/**
	 * Metodo que testa o metodo validaSenha passando como parametro uma senha com seis caracteres sem letra maiuscula.
	 * Retorno esperado false.
	 */
	@Test
	void quandoStringNaoContemLetraMaiusculaRetornaFalse() {
		String entrada = "abb12*";
		assertFalse(validaSenha(entrada), "Senha fraca! A senha deve conter "
				+ "pelo menos: \n-> Uma letra maiuscula;\n-> Uma letra minuscula;"
				+ "\n-> Um numero;\n-> Um carcater especial '!@#$%^&*()-+'");
	}
	
	/**
	 * Metodo que testa o metodo validaSenha passando como parametro uma senha com seis caracteres sem letra minuscula.
	 * Retorno esperado false.
	 */
	@Test
	void quandoStringNaoContemLetraMinusculaRetornaFalse() {
		String entrada = "ABC12*";
		assertFalse(validaSenha(entrada), "Senha fraca! A senha deve conter "
				+ "pelo menos: \n-> Uma letra maiuscula;\n-> Uma letra minuscula;"
				+ "\n-> Um numero;\n-> Um carcater especial '!@#$%^&*()-+'");
	}
	
	/**
	 * Metodo que testa o metodo validaSenha passando como parametro uma senha com seis caracteres sem numero.
	 * Retorno esperado false.
	 */
	@Test
	void quandoStringNaoContemNumeroRetornaFalseMaisMensagem() {
		String entrada = "Abc&)*";
		assertFalse(validaSenha(entrada), "Senha fraca! A senha deve conter "
				+ "pelo menos: \n-> Uma letra maiuscula;\n-> Uma letra minuscula;"
				+ "\n-> Um numero;\n-> Um carcater especial '!@#$%^&*()-+'");
	}
	
	/**
	 * Metodo que testa o metodo validaSenha passando como parametro uma senha com seis caracteres sem caracter especial.
	 * Retorno esperado false.
	 */
	@Test
	void quandoStringNaoContemCaracterEspecialRetornaFalseMaisMensagem() {
		String entrada = "Abc123";
		assertFalse(validaSenha(entrada), "Senha fraca! A senha deve conter "
				+ "pelo menos: \n-> Uma letra maiuscula;\n-> Uma letra minuscula;"
				+ "\n-> Um numero;\n-> Um carcater especial '!@#$%^&*()-+'");
	}
	
	/**
	 * Metodo que testa o metodo validaSenha passando como parametro uma senha que cumpre os requisitos de senha forte.
	 * Retorno esperado true.
	 */
	@Test
	void quandoStringCumpreRequisitosDeSenhaForte() {
		String entrada = "Abc12*";
		assertTrue(validaSenha(entrada));
	}

}

package main.questao2;

import java.util.Scanner;

/**Classe responsavel por verificar e validar a força de uma senha. Para a senha ser válida deve possuir:
 * no mínimo seis caracteres,
 * pelo menos uma letra maiúscula,
 * pelo menos uma letra minúscula,
 * pelo menos um número,
 * pelo menos um dos caracteres especiais !@#$%&*()_+'
 *  
 * @author Everton Trennepohl
 *
 */
public class Questao2 {
	
	/**Método principal responsável por fazer a leitura da senha do console.
	 * 
	 * @param args *-*
	 * @see validaSenha(String senha)
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha= "";
        do {
            System.out.println("Digite a senha: ");
             senha = scan.nextLine();
        } while (!validaSenha(senha));
        scan.close();
    }
    
    /**Método responsável pela validação da senha. Caso a senha seja fraca, retorna uma mensagem informando
     * o que está faltando para a senha ser forte. 
     * @param senha - String - Senha digitada pelo usuário.
     * @return boolean
     */
    public static boolean validaSenha(String senha) {
        if (senha.length() < 6) {
            System.out.println("Senha fraca! Adicione mais " + (6 - senha.length()) + " caracteres.");
            return false;
        }
        boolean numero = false;
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean especial = false;
        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                numero = true;
            } else if (c >= 'A' && c <= 'Z') {
                maiuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                minuscula = true;
            } else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^'
                    || c == '&' || c == '*' || c == '(' || c == ')' || c == '-' || c == '+') {
                especial = true;
            }
        }
        if (!(numero && maiuscula && minuscula && especial)) {
            System.out.println("Senha fraca! A senha deve conter pelo menos: \n-> Uma letra maiúscula;" +
                    "\n-> Uma letra minúscula;\n-> Um número;\n-> Um carcater especial '!@#$%^&*()-+'");
        }
        return numero && maiuscula && minuscula && especial;
    }
}

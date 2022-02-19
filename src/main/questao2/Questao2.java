package main.questao2;

import java.util.Scanner;

/**Classe responsavel por verificar e validar a for�a de uma senha. Para a senha ser v�lida deve possuir:
 * no m�nimo seis caracteres,
 * pelo menos uma letra mai�scula,
 * pelo menos uma letra min�scula,
 * pelo menos um n�mero,
 * pelo menos um dos caracteres especiais !@#$%&*()_+'
 *  
 * @author Everton Trennepohl
 *
 */
public class Questao2 {
	
	/**M�todo principal respons�vel por fazer a leitura da senha do console.
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
    
    /**M�todo respons�vel pela valida��o da senha. Caso a senha seja fraca, retorna uma mensagem informando
     * o que est� faltando para a senha ser forte. 
     * @param senha - String - Senha digitada pelo usu�rio.
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
            System.out.println("Senha fraca! A senha deve conter pelo menos: \n-> Uma letra mai�scula;" +
                    "\n-> Uma letra min�scula;\n-> Um n�mero;\n-> Um carcater especial '!@#$%^&*()-+'");
        }
        return numero && maiuscula && minuscula && especial;
    }
}

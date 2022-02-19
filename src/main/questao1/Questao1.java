package main.questao1;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**Classe que desenha uma escada com asteriscos no console, com o n�mero de degraus informado pelo usu�rio.
 * @author Everton Trennepohl
 */
public class Questao1 {
    /**M�todo principal que chama o m�todo desenhaEscada, respons�vel por imprimir a escada na tela.
     * @param args **
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	int degraus = lerDegraus(scan);
    	desenhaEscada(degraus);
    }

    /**M�todo responsavel por ler a entrada do usu�rio e verificar se a entrada � um n�mero positivo.
     * A leitura e verifica��o est�o dentro de um la�o, caso o valor que o usu�rio informou seja inv�lido
     * � exibida uma mensagem e solicitado ao usu�rio que digite o n�mero de degraus novamente.
     * 
     * @param scan objeto do tipo Scanner
     * 
     * @return int - n�mero de degraus
     */
    public static int lerDegraus(Scanner scan) {
        int degraus = 0;
        String msgErro = "Valor inv�lido! O valor deve ser um inteiro positivo.";
        do {
            System.out.println("Informe o n�mero de degraus da escada:");
            try {
                degraus = scan.nextInt();
                if (degraus <= 0) {
                    System.out.println(msgErro);
                }
            } catch (NoSuchElementException e) {
                System.out.println(msgErro);
                scan.nextLine();
            }
        } while (degraus <= 0);
        scan.close();
        return degraus;
    }

    /**M�todo respons�vel por desenhar a escada com a quantidade de degraus que o usu�rio informou.
     * @param degraus int - N�mero de degraus que deve ter a escada.
     */
    private static void desenhaEscada(int degraus) {
        String escada = "";
        int cont = degraus;
        while (cont > 0) {
            escada += " ";
            cont--;
        }
        char[] aux = escada.toCharArray();
        for (int i = degraus -1; i >= 0; i--) {
            aux[i] = '*';
            escada = String.valueOf(aux);
            System.out.println(escada);
        }
    }
}
package main.questao1;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**Classe que desenha uma escada com asteriscos no console, com o número de degraus informado pelo usuário.
 * @author Everton Trennepohl
 */
public class Questao1 {
    /**Método principal que chama o método desenhaEscada, responsável por imprimir a escada na tela.
     * @param args **
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	int degraus = lerDegraus(scan);
    	desenhaEscada(degraus);
    }

    /**Método responsavel por ler a entrada do usuário e verificar se a entrada é um número positivo.
     * A leitura e verificação estão dentro de um laço, caso o valor que o usuário informou seja inválido
     * é exibida uma mensagem e solicitado ao usuário que digite o número de degraus novamente.
     * 
     * @param scan objeto do tipo Scanner
     * 
     * @return int - número de degraus
     */
    public static int lerDegraus(Scanner scan) {
        int degraus = 0;
        String msgErro = "Valor inválido! O valor deve ser um inteiro positivo.";
        do {
            System.out.println("Informe o número de degraus da escada:");
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

    /**Método responsável por desenhar a escada com a quantidade de degraus que o usuário informou.
     * @param degraus int - Número de degraus que deve ter a escada.
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
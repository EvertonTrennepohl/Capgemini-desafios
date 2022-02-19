## Resolução das questões do Desafio de Programação - Academia Capgemini ##

Para rodar as resoluções das questões:

-> Necessário Java 11 ou superior instalado;

-> Baixar o projeto do github;

-> Descompactar o arquivo;

-> Abrir o terminal(linux) ou cmd(windows);

-> Entrar na pasta ..\Capgemini-desafios-main\bin;

-> Executar 'java main.questao1.Questao1' para rodar a solução da questão 1;

-> Executar 'java main.questao1.Questao2' para rodar a solução da questão 2;

-> Executar 'java main.questao1.Questao3' para rodar a solução da questão 3;


** Tecnologias utilizadas

* JDK 11.0.13

* Spring Tools Suite 4.13.0

* JUnit 5

*** Para executar os testes:

 * abrir o projeto no Spring Tools Suite;

 * clicar com o botão direito sobre o nome do projeto;

 * clicar em 'Run As';

 * clicar em 'JUnit Test'


**** A documentação está dentro da pasta javadoc.


DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI

# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
Exemplo:
Entrada:
n = 6


Saída:
     *
    **
   ***
  ****
 *****
******


# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:
Entrada:
Ya3


Saída:
3


Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo


Saída:
2


Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 


Exemplo 2)
Entrada:
ifailuhkqq


Saída:
3


Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

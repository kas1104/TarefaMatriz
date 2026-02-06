package TarefaMatriz;

import java.util.Scanner;
public class AtividadeMatriz {

    public static void main(String[] args){
        //Variaveis da função principal
        Scanner sc = new Scanner(System.in);
        int numEscreva, numLinhas, numColunas;
        int[][] tabelaInteira;

        //Mensagens perguntando a quantidade de linhas e colunas ao usuario
        System.out.println("Digite o numero de linhas que sua tabela vai ter:");
        numLinhas = sc.nextInt();

        System.out.println("Digite o numero de colunas que sua tabela vai ter");
        numColunas = sc.nextInt();

        //Atribuição do quantidade de linas e colunas que o usuario quer
        tabelaInteira = new int[numLinhas][numColunas];

        //metodo que executa a logica para compor a tabela com numeros
        logicaTabela(tabelaInteira);

        //metodo que puxa a função para exibir os dados
        exibirDados(tabelaInteira);

        sc.close();
    }

    //Função que pergunta ao usuario qual numero ele quer colocar na tabela
    public static void logicaTabela(int[][] tabelaInteira){
        Scanner sc = new Scanner(System.in);
        for(int x = 0; x < tabelaInteira.length; x++){
            //A variavel Y referente as colunas ira compos todos os valores na variavel X referente a linha e quando terminar ele passa para a proxima linha
            for(int y = 0; y < tabelaInteira[x].length; y++){
                System.out.println("Digite um numero para compor a tabela:");
                tabelaInteira[x][y] = sc.nextInt();
            }
        }
        sc.close();
    }

    //Função que exibe os dados de forma ordenada em tabela
    private static void exibirDados(int[][] tabelaInteira){
        for(int x = 0; x < tabelaInteira.length; x++){
            //A variavel Y referente as colunas ira compos todos os valores na variavel X referente a linha e quando terminar ele passa para a proxima linha
            for(int y = 0; y < tabelaInteira[x].length; y++){
                System.out.print("|| O numero: " + "[" + tabelaInteira[x][y] + "]" + ", se encontra na posição" + "{" + x + "}" + "{" + y + "}");
            }
            System.out.println();
        }
    }
}

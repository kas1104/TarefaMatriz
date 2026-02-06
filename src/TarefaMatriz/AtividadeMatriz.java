package TarefaMatriz;

import java.util.Scanner;
public class AtividadeMatriz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numEscreva, numLinhas, numColunas;
        int[][] tabelaInteira;

        System.out.println("Digite o numero de linhas que sua tabela vai ter:");
        numLinhas = sc.nextInt();

        System.out.println("Digite o numero de colunas que sua tabela vai ter");
        numColunas = sc.nextInt();

        tabelaInteira = new int[numLinhas][numColunas];

        logicaTabela(tabelaInteira);

        exibirDados(tabelaInteira);

        sc.close();
    }

    public static void logicaTabela(int[][] tabelaInteira){
        Scanner sc = new Scanner(System.in);
        for(int x = 0; x < tabelaInteira.length; x++){
            for(int y = 0; y < tabelaInteira[x].length; y++){
                System.out.println("Digite um numero para compor a tabela:");
                tabelaInteira[x][y] = sc.nextInt();
            }
        }
        sc.close();
    }

    private static void exibirDados(int[][] tabelaInteira){
        for(int x = 0; x < tabelaInteira.length; x++){
            for(int y = 0; y < tabelaInteira[x].length; y++){
                System.out.print("|| O numero: " + "[" + tabelaInteira[x][y] + "]" + ", se encontra na posição" + "{" + x + "}" + "{" + y + "}");
            }
            System.out.println();
        }
    }
}

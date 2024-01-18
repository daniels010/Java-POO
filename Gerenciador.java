//package atividade02;

import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        JogadorHumano jogadorX = new JogadorHumano('X');
        JogadorHumano jogadorO = new JogadorHumano('O');
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner input = new Scanner(System.in);
        byte jogador, linha, coluna;

        System.out.println("Bem-vindo Ao jogo da Velha !!!\n" +
                "______________________________\n");
        System.out.println("##Menu de Opcoes##\n" +
                "Quem vai jogar primeiro?\n" +
                "\n1: Para jogador 'X'" +
                "\n2: Para jogador 'O'");
        jogador = input.nextByte();
        while (!tabuleiro.fimJogo()){
            while (jogador == 1 && !tabuleiro.fimJogo()) {
                System.out.println("Jogador X digite as posicoes linha");
                linha = input.nextByte();
                System.out.println("Jogador X digite as posicoes coluna");
                coluna = input.nextByte();
                tabuleiro.inserirPeca(linha, coluna, jogadorX.obterSimbolo());
                tabuleiro.apresentarPecas();
                jogador = 2;
            }
            while (jogador == 2 && !tabuleiro.fimJogo()) {
                System.out.println("Jogador O digite as posicoes linha");
                linha = input.nextByte();
                System.out.println("Jogador O digite as posicoes coluna");
                coluna = input.nextByte();
                tabuleiro.inserirPeca(linha, coluna, jogadorO.obterSimbolo());
                tabuleiro.apresentarPecas();
                jogador = 1;
            }
        }
    }
}
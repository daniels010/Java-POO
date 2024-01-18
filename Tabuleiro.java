//package atividade02;

public class Tabuleiro {
    private char[][] tabuleiro = new char[3][3];

    public Tabuleiro(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
    public int inserirPeca(int lin, int col, char simbolo){
        if (lin >= 0 && lin <= 2 && col >= 0 && col <= 2 && tabuleiro[lin][col] == ' '){
            tabuleiro[lin][col] = simbolo;
            return 1;
        }
        return 0;
    }
    public boolean fimJogo(){
        byte count = 0;
        if(existeVencedor())
            return true;
        if (jogoEmpate())
            return true;
        return false;
    }

    public void apresentarPecas(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
    public boolean existeVencedor(){
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2])
                if (tabuleiro[i][0]!=' ') {
                    System.out.println("O jogador "+tabuleiro[i][0]+" ganhou!");
                    return true;
                }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i])
                if (tabuleiro[0][i]!=' ') {
                    System.out.println("O jogador "+tabuleiro[0][i]+" ganhou!");
                    return true;
                }
        }
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2])
            if (tabuleiro[0][0]!=' ') {
                System.out.println("O jogador "+tabuleiro[0][0]+" ganhou!");
                return true;
            }
        if (tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[0][2])
            if (tabuleiro[2][0]!=' ') {
                System.out.println("O jogador "+tabuleiro[2][0]+" ganhou!");
                return true;
            }
        return false;

    }
    public boolean jogoEmpate(){
        byte count = 0;
        if (!existeVencedor()){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] != ' ')
                        count++;
                }
            }
            if (count == 9) {
                System.out.println("Jogo empate!");
                return true;
            }
        }
        return false;
    }
}
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';
        boolean jogoAcabou = false;
        int jogadas = 0;

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        while (!jogoAcabou) {
          
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);
                    if (j < 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("  -----");
                }
            }

          
            System.out.println("Jogador " + jogadorAtual + ", digite linha e coluna: (0-2)");
            int linha = ler.nextInt();
            int coluna = ler.nextInt();

          
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente");
                continue;
            }

         
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

           
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && 
                    tabuleiro[i][1] == jogadorAtual && 
                    tabuleiro[i][2] == jogadorAtual) {
                    jogoAcabou = true;
                    break;
                }
            }

            
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[0][j] == jogadorAtual && 
                    tabuleiro[1][j] == jogadorAtual && 
                    tabuleiro[2][j] == jogadorAtual) {
                    jogoAcabou = true;
                    break;
                }
            }

          
            if (tabuleiro[0][0] == jogadorAtual && 
                tabuleiro[1][1] == jogadorAtual && 
                tabuleiro[2][2] == jogadorAtual) {
                jogoAcabou = true;
            }

            if (tabuleiro[0][2] == jogadorAtual && 
                tabuleiro[1][1] == jogadorAtual && 
                tabuleiro[2][0] == jogadorAtual) {
                jogoAcabou = true;
            }

          
            if (jogoAcabou) {
                System.out.println("Jogador " + jogadorAtual + " venceu o jogo!");
                break;
            } else if (jogadas == 9) {
                System.out.println("Empate! O jogo terminou sem vencedor.");
                jogoAcabou = true;
                break;
            }

        
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        ler.close();
    }
}
// 1. É necessário importar a classe Scanner para poder usá-la.
import java.util.Scanner;

// 2. Por convenção, nomes de classes em Java começam com letra maiúscula.
public class Vogais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char letras;

        System.out.print("Digite a letra minuscula a ser verificada: ");
        letras = ler.next().charAt(0);

        // 3. O 'else if' deve estar ligado diretamente ao 'if'. A chave '}' do main ia antes.
        //    Também corrigido o '0' (número zero) para 'o' (letra o).
        if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
            // 4. Corrigido "e" para "é" para uma melhor gramática.
            System.out.println("A letra é uma vogal.");
        }
        // 5. Adicionado um 'else' para o caso de a letra não ser vogal.
        else if (letras >= 'a' && letras <= 'z') {
            System.out.println("A letra é uma consoante!");
        }
        // 6. Adicionado um 'else' final para tratar entradas que não são letras minúsculas.
        else {
            System.out.println("Entrada inválida. Por favor, digite uma letra minúscula.");
        }
        
        // 7. É uma boa prática fechar o scanner no final para liberar recursos.
        ler.close();
    }
}
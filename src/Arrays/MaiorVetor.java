import java.util.Scanner;

public class MaiorVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[3];

        System.out.print("Entre com o primeiro valor: ");
        num[0] = ler.nextInt();
        System.out.print("Entre com o segundo valor: ");
        num[1] = ler.nextInt();
        System.out.print("Entre com o terceiro valor: ");
        num[2] = ler.nextInt();

       
        if (num[0] < num[1]) {
            int temp = num[0];
            num[0] = num[1];
            num[1] = temp;
        }
        if (num[0] < num[2]) {
            int temp = num[0];
            num[0] = num[2];
            num[2] = temp;
        }
        if (num[1] < num[2]) {
            int temp = num[1];
            num[1] = num[2];
            num[2] = temp;
        }

        System.out.println(num[0] + " > " + num[1] + " > " + num[2]);
    }
}
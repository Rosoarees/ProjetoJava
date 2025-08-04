import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] num = new int[5];
        int soma = 0;
        int i;

        System.out.print("Digite 5 numeros interiros: ");

        for (i =0; i <5; i++) {
            System.out.print("Numero: "+(i+1)+":");
            num[i] = ler.nextInt();
            soma += num[i];


        }
        System.out.print("\n : vetor:[");
        for (i =0; i < 5; i++) {
            System.err.print(num[i]);
            if (i<4)  {
                System.out.print(",");
            }
        }
        System.err.print("]");
        System.out.println("Soma dos nelementos: "+soma);
        ler.close();
     
           
       

    }


    
}



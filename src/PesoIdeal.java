import java.util.Scanner;
public class PesoIdeal {
     public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double altura, pesoIdeal;
        char sexo;
        System.out.print("Digite o sexo: ('F') para feminino, e ('M') para masculino." );
        sexo = ler.next().charAt(0);
        System.out.print("Digite sua altura: ");
        altura = ler.nextDouble();


         if ( sexo == 'M' || sexo == 'm'){
            pesoIdeal = (72.7 * altura) -58;
             System.out.print("Peso ideal masculino: "+pesoIdeal);
            }
            else if (sexo == 'F' || sexo == 'f'){
                pesoIdeal = (62.1 * altura)-44.7;
                System.out.print("Peso ideal feminino: "+pesoIdeal);
            }
            else {
                System.out.println("Sexo inválido. Digite apenas M ou F.");
            }
        ler.close();

    }
}

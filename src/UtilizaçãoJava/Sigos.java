import java.util.Scanner;
public class Sigos {
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    int mes, dia;
    System.out.print("digite o número referente ao mês do seu  nascimento : \n 1. janeiro \n 2. fevereiro \n 3. março \n 4. abril \n 5. maio \n 6. junho \n 7. julho \n 8. agosto \n 9. setembro \n 10. outubro \n 11. novembro \n 12. dezembro \n ----->");
    mes  = ler.nextInt();
    System.out.print("digite o dia  do seu  nascimento (1 á 31):");
    dia  = ler.nextInt();

        if (mes == 1){
            if (dia >= 1 && dia <= 19){
                System.out.print("você é capricorniano!");
            }
            else if ( dia >= 20 && dia <= 31){
                System.out.print("você é aquariano!");
            }
            else {
                System.out.print("Você digitou um dia de nascimento inválido!");
            }
        }
        else if (mes == 2){
            if (dia >= 1 && dia <= 18){
                System.out.print("você é aquariano!");
            }
            else if ( dia >= 19 && dia <= 27){
                System.out.print("você é pisciano!");
            }
            else {
                System.out.print("Você digitou um dia de nascimento inválido!");
            }
        }
        else if (mes == 3){
            if (dia >= 1 && dia <= 19){
               System.out.print("você é pisciano!");  
            }
            else if ( dia >= 20 && dia <= 30){
               System.out.print("você é ariano!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
        else if (mes == 4){
            if (dia >= 1 && dia <= 20){
               System.out.print("você é ariano!");  
            }
            else if ( dia >= 21 && dia <= 3){
               System.out.print("você é taurino!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
         else if (mes == 5){
            if (dia >= 1 && dia <= 20){
               System.out.print("você é taurino!");  
            }
            else if ( dia >= 21 && dia <= 31){
               System.out.print("você é geminiano!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
      else if (mes == 6){
            if (dia >= 1 && dia <= 21){
               System.out.print("você é geminiano!");  
            }
            else if ( dia >= 22 && dia <= 30){
               System.out.print("você é canceriano!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
         else if (mes == 7){
            if (dia >= 1 && dia <= 22){
               System.out.print("você é canceriano!");  
            }
            else if ( dia >= 23 && dia <= 31){
               System.out.print("você é leonino!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
         else if (mes == 8){
            if (dia >= 1 && dia <= 22){
               System.out.print("você é leonino!");  
            }
            else if ( dia >= 23 && dia <= 31){
               System.out.print("você é virginiano!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
           else if (mes == 9){
            if (dia >= 1 && dia <= 22){
               System.out.print("você é virginiano!");  
            }
            else if ( dia >= 23 && dia <= 30){
               System.out.print("você é libriano!");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
          else if (mes == 10){
            if (dia >= 1 && dia <= 22){
               System.out.print("você é libriano!");  
            }
            else if ( dia >= 23 && dia <= 31){
               System.out.print("você é escorpiano !");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
     else if (mes == 11){
            if (dia >= 1 && dia <= 21){
               System.out.print("você é escorpiano!");  
            }
            else if ( dia >= 22 && dia <= 30){
               System.out.print("você é sargitariano !");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
     else if (mes == 12){
            if (dia >= 1 && dia <= 21){
               System.out.print("você é sragitáriano!");  
            }
            else if ( dia >= 22 && dia <= 31){
               System.out.print("você é capricorniano !");    
            }
            else {
               System.out.print("Você digitou um dia de nascimento inválido!");  
            }
        }
    
    
            
        
        ler.close();
    }
}

     
    
    

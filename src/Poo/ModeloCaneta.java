

public class ModeloCaneta {
// Caracteristica - Atributo
String cor;
double ponta;
boolean tampada;
int carga;

public void tampar() {
    if (this.tampada == true) {
        System.out.println("Esso... Caneta já esta tampada:");

    }
    else {
        this.tampada=true;
    }

} 
public void destampar(){
    if (this.tampada == false) {
        System.out.println("Esso... Caneta já está destampada");
    }
    else {
        this.tampada=false;
    }
}
public void escrever(){
    if (this.tampada == true) {
        System.out.println("Esso... Caneta tampada.");
    }
    else {
        System.out.println("Escrevendo...");
        this.carga -= 5;

    }
}
public void  estado() {
    System.out.println("cor: "+this.cor);
    System.out.println("ponta:  "+this.ponta);
    System.out.println("Esta tampada: "+this.tampada);
    System.out.println("A carga está em: "+this.carga+"%");

}
public static void main(String[] args) {
    ModeloCaneta caneta = new ModeloCaneta(); // Cria uma caneta
    caneta.cor = "Vermelha";
    caneta.ponta = 0.7;
    caneta.carga = 100;
    caneta.tampada = false;
     
    // Testando os métodos
    caneta.estado(); // Mostra estado inicial
    caneta.escrever(); // Escreve (diminui carga)
    caneta.tampar(); // tampando
    caneta.escrever();// Não escreve (tampada)
    caneta.destampar();// volta a escrever 
    caneta.estado(); // Mostra estado final
    
}
}



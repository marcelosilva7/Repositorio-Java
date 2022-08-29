package aula03;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("O modelo caneta é " + this.modelo);
        System.out.println("A cor dessa caneta é " + this.cor);
        System.out.println("A ponta da caneta é de " +  this.ponta);
        System.out.println("A carga da caneta esta em %" + this.carga);
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO, A caneta esta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
}


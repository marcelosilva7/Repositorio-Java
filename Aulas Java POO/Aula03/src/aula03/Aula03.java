package aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 90;
        c1.cor = "Vermelha";
        c1.modelo = "Bic";
        c1.ponta = 0.7f;
        c1.tampar();
        c1.destampar();
        c1.status();
        
        c1.rabiscar();
      
        
        Carro carro1 = new Carro();
        carro1.bateria = 95;
        carro1.cor = "Azul";
        carro1.marca = "Fiat";
        carro1.tanque = 50;
        carro1.ligado = false;
        
        carro1.status();
        
        carro1.ligar();
        carro1.andar();
        carro1.parar();
        
    }
    
}

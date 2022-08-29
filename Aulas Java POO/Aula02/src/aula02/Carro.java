package aula02;
    public class Carro {
        
       String cor;
       String marca;
       int tanque;
       boolean ligado;
       int bateria;
       boolean andando;
       
       void status(){
           System.out.println("Cor: " + this.cor);
           System.out.println("Marca: " + this.marca);
           System.out.println("Tanque: " + this.tanque);
           System.out.println("Bateria: " + this.bateria);
           System.out.println("Ligado: " + this.ligado);
       }
       
       
       void ligar(){
           if (this.tanque > 0 && this.bateria > 0){
               this.ligado = true;
               System.out.println("Estou ligando");
           } else {
               System.out.println("Nao tenho combustivel para ligar");
           }
       }
        void desligar(){
            System.out.println("O carro esta desligado");
            this.ligado = false;
        }
    
        void andar(){
            if (this.ligado == true){
                this.andando = true;
                System.out.println("Você esta andando de carro");
                
            } else {
                System.out.println("O carro nao pode andar");
            }
        }
        void parar(){
            if (this.andando == true){
                System.out.println("O carro parou");
                this.andando = false;
            }
        }
}   

package aula05;

import java.util.Scanner;

    public class Conta {
        private int numConta;
        private String tipo;
        private String dono;
        private float saldo;
        private boolean status;
        
        public Conta(){
            this.setStatus(false);
            this.setSaldo(0.0f);
        }
        
        public void abrirConta(){
            this.setStatus(true);
            Scanner banco = new Scanner(System.in);
            this.numConta = (int) (1 + Math.random() * (10 - 1));
            System.out.println("Seu numero da conta é: " + this.tipo);
            System.out.println("Que tipo de conta deseja abrir?");
            System.out.print("Digite cc(conta correte) ou cp(conta poupança): ");
            this.tipo = banco.nextLine();
            if (this.tipo.equals("cc")){
                this.saldo = 50;
                this.pagarMensalidade();
            }else{
                this.saldo = 150;
                this.pagarMensalidade();
            }
        }
        
        public void fecharConta(){
            if(this.saldo == 0){
                this.status = false;
            }else {
                System.out.println("Por favor zere o saldo de: " + this.saldo + "para fechar a conta");
            }
        }
        
        public void depositar(float d){
            this.saldo += d;
        }
        
        public void sacar(float s){
            if (this.saldo == 0){
                System.out.println("Vc não tem saldo para sacar!");
            }else{
                this.saldo -= s;
            }
        }
        
        public void pagarMensalidade(){
            this.saldo -= 12;
        }
        
        public void status(){
            System.out.println("Sua Conta no Banco");
            System.out.println("Numero da conta: " + this.numConta);
            System.out.println("Tipo de conta: " + this.tipo);
            System.out.println("Nome do dono: " + this.dono);
            System.out.println("Seu saldo é de: " + this.saldo);
            System.out.println("O status da conta é: " + this.status);
        }
        
        public void setnumConta(int c){
            this.numConta = c;
        }
        
        public int getnumConta(){
            return this.numConta;
        }
        
        public void setTipo(String t){
            this.tipo = t;
        }

        public String getTipo() {
            return this.tipo;
        }
        
        public void setDono(String d){
            this.dono = d;
        }
        
        public String getDono(){
            return this.dono;
        }
                
        public void setSaldo(float s){
            this.saldo = s;
        }
        
        public float getSaldo(){
            return this.saldo;
        }
        
        public void setStatus(boolean t){
            this.status = t;
        }
        
        public boolean getStatus(){
            return this.status;
        }
}       

        

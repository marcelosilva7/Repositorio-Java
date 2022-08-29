package aula05;

    public class ContaBanco {
    
        private int numConta;
        private String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public ContaBanco() {
            this.setStatus(false);
            this.setSaldo(0.0f);
        }
        
        public void status(){
            System.out.println("CONTA DO BANCO-----------------------");
            System.out.println("Numero: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Nome: "+ this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " +  this.getStatus());
            System.out.println("--------------------------------------");
        }
        
        public void abrirConta(String t){
            this.setTipo(t);
            this.setStatus(true);
            if (t == "CC"){
                this.setSaldo(50.0f);
            } else if (t == "CP"){
                this.setSaldo(150.0f);
            }
            System.out.println("Conta aberta com sucesso!");
        }

        public void fecharConta(){
            if (this.getSaldo()> 0){
                System.out.println("Nao podemos fechar!Vc ainda tem saldo na conta!");
            } else if (this.getSaldo() < 0){
                System.out.println("Não podemos fechar!Vc ainda tem debito na conta!");
            }else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
        }

        public void depositar(float v){
            if (this.getStatus() == true){
                this.setSaldo(getSaldo() + v);
                System.out.println("Deposito realizado na conta de " + this.getDono());
            } else{
                System.out.println("Nao foi possivel fazer o deposito!");
            }
        }

        public void sacar(float v){
            if(this.getStatus()== true){
                if (this.getSaldo() >= v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else{
                    System.out.println("Saldo insuficiente!");
                }   
            } else{
                System.out.println("Impossivel, conta nao esta ativa!");
            }
        }

        public void pagarMensalidade(){
            int v = 0;
            if (this.getTipo() == "CC") {
                v = 12;
            } else if (this.getTipo() == "CP") {
                v = 20;   
            }
            if (this.getStatus()== true){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Impossivel pagar com uma conta fechada!");
            }
        }

        public int getNumConta() {
            return numConta;
        }

        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDono() {
            return dono;
        }

        public void setDono(String dono) {
            this.dono = dono;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    
    
    
    
}

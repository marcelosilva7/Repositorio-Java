package aula04;
    public class Caneta {
        public String modelo;
        private float ponta;
        private boolean tampar;
        private String cor;
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
        this.cor = "Azul";
        
    }
        
    public void tampar(){
        this.tampar = true;
    }
       
    public void destampar(){
        this.tampar = false;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public String getModelo(){
        return this.modelo;
    }
     public void setModelo(String m){
         this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
        
    }
    
    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampar);
        
    }
    
}


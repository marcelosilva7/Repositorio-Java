package aula05;

    public class Aula05 {

        public static void main(String[] args) {
            ContaBanco c1 = new ContaBanco();
            c1.setDono("Marcio");
            c1.setNumConta(1111);
            c1.abrirConta("CC");
            
            ContaBanco c2 = new ContaBanco();
            c2.setDono("Creusa");
            c2.setNumConta(2222);
            c2.abrirConta("CP");
            
            
            
            c1.depositar(300);
            c2.depositar(500);
            
            c2.sacar(100);
            
            c1.status();
            c2.status();
    }
    
}

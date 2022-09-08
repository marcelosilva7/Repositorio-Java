
package aula09;

public class Livro implements Publicação {
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private int pagAtual;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
   
    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "," + "\nautor=" + autor + "," + "\ntotPaginas=" + totPaginas + "," + "\npagAtual=" + pagAtual
                + "\naberto=" + aberto + "," + "\nleitor=" + this.leitor.getNome() + "," + "\nIdade=" + this.leitor.getIdade() + "," + 
                "Sexo=" + this.leitor.getSexo() + '}';
    }
    
    
    /*public void detalhes(){
        System.out.println("### Detalhes do livro ###");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Total de Pag: " + this.getTotPaginas());
        System.out.println("O livro esta aberto? " + this.getAberto());
        System.out.println("Quem esta lendo o livro? " + this.getLeitor());
       
    }*/
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);   
    }

    @Override
    public void folear(int p) {
        this.setPagAtual(p);
        
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
        
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual()> 0){
            this.setPagAtual(this.getPagAtual() -1);
        }
        
    }
    
    
    
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author marce
 */
public class ProjetoLivro {
    
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Marcelo", 51, "Masculino");
        p[1] = new Pessoa("Dirce", 70, "Feminino");
        
        l[0] = new Livro("Javaa Ini", "Guanas", 300, p[0]);
        l[1] = new Livro("Python", "Nadas", 5000, p[0]);
        l[2] = new Livro("Biblia", "Moises", 700, p[1]);
        
        l[0].abrir();
        l[0].folear(30);
        
        System.out.println(l[0].detalhes());
        
        
        
        
    }
    
}

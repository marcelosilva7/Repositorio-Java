/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14e15;

/**
 *
 * @author marce
 */
public class Aula14e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v1 = new Video("Curso");
        Video v2 = new Video("POO");
        
        Gafanhoto g1 = new Gafanhoto("Mauricio", 51, "Masculino", "mau");
        
        Vizualizacao visu = new Vizualizacao(g1, v1);
        visu.avaliar(81);
        System.out.println(visu.toString());
        
        System.out.println(g1.toString());
        
        System.out.println(v1.toString());
        
    }
    
}

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
public class Vizualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews()+ 1);
    }

    public void avaliar(){
        this.filme.setAvalicao(5);
        
    }
    
    public void avaliar(int nota){
        this.filme.setAvalicao(nota);
        
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else{
            tot = 10;
        } 
        this.filme.setAvalicao(tot);
        
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
        
}

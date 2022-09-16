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
public class Gafanhoto extends Pessoa {
    private String loguin;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String loguin) {
        super(nome, idade, sexo);
        this.loguin = loguin;
        this.totAssistido = 0;
    }
    
    public void viuMiasUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nloguin=" + loguin + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}

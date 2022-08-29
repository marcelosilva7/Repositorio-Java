/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = "30.5";
        float numero = Float.parseFloat(valor);
        int numeros = Integer.parseInt(valor);
        int aleatorio = 50;
        String alfa = Integer.toString(aleatorio);
        String beta = Float.toString(aleatorio);
        
             
        Scanner variavel = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = variavel.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = variavel.nextFloat();
        System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        System.out.format("A nota de %s é de %.2f \n", nome, nota);
        
    }
    
}

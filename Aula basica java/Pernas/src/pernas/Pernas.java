/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas vc tem? ");
        int pernas = tec.nextInt();
        System.out.print("Isso é um(a) ");
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripede";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Octopus";
                break;
            default:
                tipo = "ET";
                
        }
        System.out.print(tipo);
                
    }
    
}

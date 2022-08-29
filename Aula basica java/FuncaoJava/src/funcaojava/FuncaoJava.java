/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaojava;

/**
 *
 * @author marce
 */
public class FuncaoJava {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
        
    }    
    static int somas (int a, int b){
        int s = a + b;
        return s;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        soma(9,8);
        int sm = somas(45,15);
        System.out.println("a soma é de " + sm);
    }
    
}

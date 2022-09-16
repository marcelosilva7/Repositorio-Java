/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasprontas;

import javax.swing.JOptionPane;
/**
 *
 * @author marce
 */
public class JanelasProntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, media, s = 0, p = 0, i = 0, cem = 0, cc = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um Numero: <br><em>(valor 0 interrompe)</br><html>"));
            if (n % 2 == 0){
                p += 1;
            } else{
                i += 1;
            }
            if (n > 100){
                cem += 1;
                
            }
            cc +=1;
            s += n;
        } while (n != 0);
        p = p - 1;
        media = s/cc;
        JOptionPane.showMessageDialog(null, "<html>O Resuntado foi<hr>" +
                "Somatorio = " + s + "<br>" +
                "Total de Pares: "+ p + "<br>" +
                "Total de Impares: " + i + "<br>"+
                "Total acima de 100: " + cem + "<br>" +
                "A media foi de: " + media + "<br>" + "</html>");
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestipos;

/**
 *
 * @author Joao
 */
public class TestesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
        
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        
        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor);
        System.out.printf("%.3f \n", idade2);
        
        }
    
}

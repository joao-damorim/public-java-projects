/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author Joao
 */
public class Operacoes {
    
    public static String contador(int i, int f){
        String s = "";
        for(int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
    
    public static int soma(int i, int j){
        int total = i + j;
        return total;
        
        
    }
    
}

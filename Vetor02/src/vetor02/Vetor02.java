/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author Joao
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }
        System.out.print("\n");
        double num[] = {3.5,5,1.9,8,-4.98};
        Arrays.sort(num);
        int pos = Arrays.binarySearch(num, 8);
        System.out.println("Encontrei o valor na posição " + pos);
                
        for(double valor: num){
            System.out.print(valor+" ");            
        }
        System.out.print("\n\n");
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
    
}

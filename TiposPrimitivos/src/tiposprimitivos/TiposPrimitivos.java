/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.print("Digita a idade do aluno: ");
        int idade2 = teclado.nextInt();
        System.out.print("Digite a mensalidade do aluno: ");
        float mensalidade2 = teclado.nextFloat();
        
        System.out.format("A nota de %s, que tem %d anos, cuja mensalidade é %.2f  é %.2f. \n\n", nome2, idade2, mensalidade2, nota2);
        
        
        String nome = "João";
        float nota = (float) 8.5;
        System.out.println("A nota é " + nota + ".");
        System.out.printf("A nota de %s é %.2f. \n", nome, nota);
        System.out.format("A nota de %s é %.2f. \n", nome, nota);
    }
    
}

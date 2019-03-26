/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex2;

/**
 *
 * @author pires
 */
public class Ficha2Ex2 {

    public static void main(String[] args) {
        int [][] matriz={{11,7,333},{-20,-23,63},{-22,501,10000}};
        int soma=0;
        double media;
        
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                soma += matriz1[j];
                System.out.println(matriz1[j] + "\t");
            }
            System.out.println();
        }
    media=(double)soma/9;
    System.out.println("\nSoma dos elementos:"+soma+"\nMédia dos elementos:"+media);
    }
}


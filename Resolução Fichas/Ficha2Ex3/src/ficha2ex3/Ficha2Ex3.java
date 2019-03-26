/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex3;

/**
 *
 * @author pires
 */
public class Ficha2Ex3 {

    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int multip=1, neg=0;
        int max=0;
        
        for(int i=0;i<lista.length;i++){
            if (lista[i]>0){
                multip=multip*lista[i];
            }else{
                neg++;
            }
        if (lista[i]>max){
            max=lista[i];
            
        }
            System.out.println("multiplicação: "+multip+"\nNegativos: "+neg+"\nMaior Numero: "+max);
        }
    }   
}

    

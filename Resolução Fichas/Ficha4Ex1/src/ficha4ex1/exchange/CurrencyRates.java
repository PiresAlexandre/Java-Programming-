/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1.exchange;

/**
 *
 * @author pires
 */
public class CurrencyRates {
    
    protected double[][] cambio; 
    
    public CurrencyRates() {
            
        this.cambio[0][0] = 1.00000;
        this.cambio[0][1] = 0.76900;
        this.cambio[0][2] = 96.1141;
        this.cambio[0][3] = 0.67131;
        this.cambio[1][0] = 1.30030;
        this.cambio[1][1] = 1.00000;
        this.cambio[1][2] = 124.989;
        this.cambio[1][3] = 0.87290;
        this.cambio[2][0] = 96.06148;
        this.cambio[2][1] = 125.00000;
        this.cambio[2][2] = 1.00000;
        this.cambio[2][3] = 143.26648;
        
    }    
    
    public double convert (double quantidadeDinheiro, char nomeMoeda, char converterMoeda){
        double money = 0.0;
        
switch (converterMoeda){
    case 'D':
        switch (nomeMoeda){
            case 'D':
                money = quantidadeDinheiro;
                break;
                
            case 'E':
                
                
        }
}
        
    
        


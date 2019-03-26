/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1;

/**
 *
 * @author pires
 */
public class Expenses {
    private static final int NUMBER_OF_DAYS = 31; //para o mes de março
    
    //Para despesas com o automovel
    private static int number1;
    /**
     * Vetor com o valor das despesas de automovel durante o dia do mês
     * (o indice do vetor corresponde ao dia do mes) 
     */
    private static double[] carValues = new double[NUMBER_OF_DAYS];//em euros
    private static char[] descriptionCar = new char[]{'C','A','R'};
    
    //Para despesas alimentares
    private static int number2;
    private static double[] foodValues = new double[NUMBER_OF_DAYS];//em euros
    private static char[] desciptionFood = new char[]{'F','O','O','D'};

    public Expenses(int number1, double[] carValues, int number2, double[] foodValues) {
        Expenses.number1 = number1;
        Expenses.number2 = number2;
        Expenses.carValues = carValues;
        Expenses.foodValues = foodValues;
    }

    public static int getNumber1() {
        return number1;
    }

    public static double[] getCarValues() {
        return carValues;
    }

    public static int getNumber2() {
        return number2;
    }

    public static double[] getFoodValues() {
        return foodValues;
    }

    public static char[] getDescriptionCar() {
        return descriptionCar;
    }

    public static char[] getDesciptionFood() {
        return desciptionFood;
    }
    
    
}

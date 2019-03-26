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
public class Ficha4Ex1 {
    static User user1;
    static User user2;
    static Expenses despesasUser1;
    static Expenses despesasUser2;

    
    public static void main(String[] args) {
        double totalGasto = 0.0, medioGasto = 0.0;
        char[] id,name,email;
        double[] carValues,foodValues;
        int number1, number2;
                
        /* USER 1 */
        
        id = new char[]{'A','B','C'};      
        name = new char[]{'B','r','u','n','o'};
        email = new char[]{'b','m','o','@','e','t','g','f','.','i','p','p','.','p','t'};
        
        number1 = 2;
        carValues = new double[]{23.2, 12.0};
        
        number2 = 2;
        foodValues = new double[]{32.2, 9.5};
        
        despesasUser1 = new Expenses(number1,carValues,number2,foodValues);
        user1 = new User(id,name,email,despesasUser1);
              
        System.out.println("------ User 1 ------");
        System.out.println("ID: ");
        System.out.println(user1.getId());
        System.out.println("Name: ");
        System.out.println(user1.getName());
        System.out.println("Email: ");
        System.out.println(user1.getEmail());
        System.out.println("Dias com despesas do automovel: ");
        System.out.println(despesasUser1.getNumber1());
        System.out.println("Despesas: ");
        
        double[] aux = despesasUser1.getCarValues();
        for(int i=0;i<despesasUser1.getNumber1();i++){
            
            System.out.println(aux[i]);
            
            if(i < despesasUser1.getNumber1() - 1){
                System.out.println(" - ");
            }
            totalGasto += aux[i];
        }
        medioGasto = totalGasto / despesasUser1.getNumber1();
        
        System.out.println("Total de Gastos: " + totalGasto);
        System.out.println("Media de Gastos: " + medioGasto);
        System.out.println("Descrição do Carro: ");
        System.out.println(despesasUser1.getDescriptionCar());
        System.out.println("Dias com despesas alimentares: ");
        System.out.println(despesasUser1.getNumber2());
        System.out.println("Despesas alimentares: ");
        
        double[] aux2 = despesasUser1.getFoodValues();
        for(int i=0;i<despesasUser1.getNumber2();i++){
            
            System.out.println(aux[i]);
            
            if(i < despesasUser1.getNumber2() - 1){
                System.out.println(" - ");
            }
        }
        System.out.println("Descrição: ");
        System.out.println(despesasUser1.getDesciptionFood());
        
        /* USER 2 */
        
        id = new char[]{'V','D','A'};
        name = new char[]{'A','l','e','x'};
        email = new char[]{'a','p','p','@','e','t','g','f','.','i','p','p','.','p','t'};
        
        number1 = 2;
        carValues = new double[]{98.2, 5.0};
        number2 = 2;
        foodValues = new double[]{32.2, 9.5};
        
        despesasUser2 = new Expenses(number1,carValues,number2,foodValues);
        user2 = new User(id,name,email,despesasUser2);
              
        System.out.println("------ User 2 ------");
        System.out.println("ID: ");
        System.out.println(user2.getId());
        System.out.println("Name: ");
        System.out.println(user2.getName());
        System.out.println("Email: ");
        System.out.println(user2.getEmail());
        System.out.println("Dias com despesas do automovel: ");
        System.out.println(despesasUser2.getNumber1());
        System.out.println("Despesas: ");
        
        double[] c = despesasUser2.getCarValues();
        for(int i=0;i<despesasUser2.getNumber1();i++){
            
            System.out.println(c[i]);
            
            if(i < despesasUser2.getNumber1() - 1){
                System.out.println(" - ");
            }
            totalGasto += c[i];
        }
        medioGasto = totalGasto / despesasUser2.getNumber1();
        System.out.println("\nTotal de Gastos: " + totalGasto);
        System.out.println("Media de Gastos: " + medioGasto);
        System.out.println("Descrição do Carro: ");
        System.out.println(despesasUser2.getDescriptionCar());
        System.out.println("Dias com despesas alimentares: ");
        System.out.println(despesasUser2.getNumber2());
        System.out.println("Despesas alimentares: ");
        double[] c2 = despesasUser2.getFoodValues();
        for(int i=0;i<despesasUser2.getNumber2();i++){
            
            System.out.println(c2[i]);
            
            if(i < despesasUser2.getNumber2() - 1){
                System.out.println(" - ");
            }
        }
        System.out.println("Descrição: ");
        System.out.println(despesasUser2.getDesciptionFood());
        // exer 3.2
    }
}

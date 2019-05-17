/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjavataty.fapi.edu.br.ex2;


public class MainCalculadora {

    public static void main(String[] args) {
    
        Operacoes seumizeravel= new Soma();
        seumizeravel.calcular(1, 2);
        
        seumizeravel=new Multiplicacao();
        seumizeravel.calcular(3, 2);
        
        seumizeravel=new Subtracao();
        seumizeravel.calcular(5, 3);
        
        seumizeravel= new Divisao();
        seumizeravel.calcular(4, 0);

    }
  
}

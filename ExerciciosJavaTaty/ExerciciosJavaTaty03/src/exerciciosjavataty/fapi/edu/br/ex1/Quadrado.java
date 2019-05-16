package exerciciosjavataty.fapi.edu.br.ex1;

import java.util.Scanner;

public class Quadrado implements FormaGeometrica {
    
    int lado;
    Scanner leia = new Scanner(System.in);
    
    public void infoLado(){
        System.out.println("Digite lado do quadrado");
        lado=leia.nextInt();
    }

    @Override
    public int calcularArea() {
        int result=lado*lado;
        return result;
    }

    @Override
    public int calcularPerimetro() {
        int resultado=lado+lado+lado+lado;
        return resultado;
    }
    
}

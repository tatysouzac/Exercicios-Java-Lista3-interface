package exerciciosjavataty.fapi.edu.br.ex1;

import java.util.Scanner;

public class Circulo implements FormaGeometrica{
    int perimetro;
    Scanner leia = new Scanner(System.in);
    
  
    public void infoPerimetro(){
        System.out.println("Digite perimetro do circulo");
        perimetro=leia.nextInt();
    }
    
    @Override
    public int calcularArea() {
        int result= (int) (3.14 * (perimetro * perimetro));
        return result;
    }

    @Override
    public int calcularPerimetro() {
        int result= (int) (2* 3.14 * perimetro);
        return result;
    }
    
}

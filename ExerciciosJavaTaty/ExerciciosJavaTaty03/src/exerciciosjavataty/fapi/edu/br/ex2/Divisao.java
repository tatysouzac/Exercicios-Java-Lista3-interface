package exerciciosjavataty.fapi.edu.br.ex2;

public class Divisao implements Operacoes{

    @Override
    public void calcular(int num1, int num2) {
        if(num2 == 0){
            System.out.println("Não possivel dividir por 0");
        }else if(num2 != 0){
            
        int result= num1 / num2;
        System.out.println(result);
    }
  }   
}

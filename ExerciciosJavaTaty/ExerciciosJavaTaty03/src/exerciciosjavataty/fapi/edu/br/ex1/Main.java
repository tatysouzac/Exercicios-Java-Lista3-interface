package exerciciosjavataty.fapi.edu.br.ex1;

public class Main {
    
	 public static void main(String[] args) {
		    
	        Quadrado quadrado= new Quadrado();
	        quadrado.infoLado();
	        int aq = quadrado.calcularArea();
	        System.out.println(aq);
	        int pq = quadrado.calcularPerimetro();
	        System.out.println(pq);
	        
	        Circulo circulo= new Circulo();
	        circulo.infoPerimetro();
	        int ac = circulo.calcularArea();
	        System.out.println(ac);
	        int pc = circulo.calcularPerimetro();
	        System.out.println(pc);
	        
	    }
    
}

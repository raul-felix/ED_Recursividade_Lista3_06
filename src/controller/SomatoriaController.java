package controller;

public class SomatoriaController {
	
	public SomatoriaController() {
		super();
	}
	
	public double somatoriaFracao(int n) {
		
		if (n == 1) {
			// se n == 1, retornamos 1, pois 1/1 = 1 
			return 1;
		} else {
			// se não, calculamos a fração 1 / n
			// então retornamos a soma dessa fração com a função recursiva, passando como parâmetro (n - 1)
			double fracao = 1 / (double) fatorial(n);
			return fracao + somatoriaFracao(n - 1);
		}
	}
	
	public int fatorial(int n) {
		
		if (n == 0) {
			// se n == 0, retornamos 1 já que o fatorial de 0 é 1 
			return 1;
		} else {
			// se não, retornamos n multiplicado pelo fatorial de (n - 1)
			// 5! = 5 * 4!
			// 4! = 4 * 3! etc
			return n * fatorial(n - 1);
		}
	}

}

package view;

import controller.SomatoriaController;

public class Main {

	public static void main(String[] args) {
		
		SomatoriaController somaController = new SomatoriaController();
		int n = 4;
		double resultado = somaController.somatoriaFracao(n);
		System.out.println(resultado);
	}
}

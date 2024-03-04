package controller;

public class SumController {
	
	public SumController() {
		super();
	}
	
	public double sum(int n) {
		//A recursiva se encerra quando se alcanca o primeiro termo da seria, que sempre e o numero 1
		if(n == 1) {
			return 1;
		} else {
			//Calculado primeramente o fatorial de forma
			//recursiva e somando o resultado a chamada do metodo, que recebe o termo anterior como parametro
			return (double)1/fat(n) + sum(n-1);
		}
	}
	
	private int fat(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * fat(n - 1);
		}
	}
}

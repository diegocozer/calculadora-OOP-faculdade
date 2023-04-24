

public class Operacao {

	public double adicao(double num1, double num2) {
		double resultado = 0;
		resultado = num1 + num2;
		return (double) resultado;
	}
	
	public double subtracao(double num1, double num2) {
		double resultadoSub = 0;
		resultadoSub = num1 - num2;
		return (double) resultadoSub;
	}
	
	public double multiplicacao(double num1, double num2 ) {
		double resultadoMult = 0;
		resultadoMult = num1 * num2;
		return (double) resultadoMult;
	}
	
	public double divisao(double num1, double num2) {
		double resultadoDiv = 0;
		resultadoDiv = num1 / num2;
		return (double) resultadoDiv;
	}
	
	public double exponensial(double num1, double num2) {
		double resultadoExpo = 1;
		for(int i = 0; i < num2; i++) {
			resultadoExpo *= num1; 
		}
		return (double)	resultadoExpo;
	}
	public double fatorial(double num1) {
		double resultadoFato = 1;
		for(int i = 1; i <= num1; i++) {
			resultadoFato *= i;
		}
		return (double) resultadoFato;
		
	}	
}

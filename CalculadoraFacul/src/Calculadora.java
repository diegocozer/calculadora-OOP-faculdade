import java.text.DecimalFormat;
import java.util.Scanner;
import Operacao.operacao;
public class Calculadora {
	
	

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);			
	System.out.println("Digite a operação(1 - Adição, 2 - subtração, 3 - multiplicação, 4 - divisão, 5-exponenciação, 6-fatorial) ");
	int tipo = teclado.nextInt();
	
		
	
	double valor1 = 0;
	double valor2 = 0;
	
	if(tipo != 6 & tipo < 6) {
		System.out.println("Digite o valor 2: ");
		valor2 = teclado.nextInt();
	}
	else if(tipo < 6) {
		System.out.println("Digite o valor 1:");
		valor1 = teclado.nextInt();
	}
	

	teclado.close();
	
	
	
//	switch(tipo) {
//	case 1: System.out.println("Adição de "+ valor1 + " + " + valor2 + " = " + (valor1 + valor2)); break;
//	case 2: System.out.println("Subtração de "+ valor1 + " - " + valor2 + " = " +(valor1 - valor2)); break;
//	case 3: System.out.println("Multiplicaçãode "+ valor1 + " x " + valor2 + " = " +(valor1 * valor2)); break;
//	case 4: System.out.println("Divisão de "+ valor1 + " / " + valor2 + " = " + (valor1 / valor2)); break;
//	case 5:
//		double resultado = 1;
//		for(int i = 0; i < valor2; i++) {
//			resultado *= valor1; 
//		}
//		System.out.println("Exponensial de "+ valor1 + " ^ " + valor2 + " = " + (resultado));
//		break;
//	case 6: 
//		double resultadoFato = 1;
//		for(int i = 1; i <= valor1; i++) {
//			resultadoFato *= i;
//			System.out.println(resultadoFato);
//		}
//		System.out.println("Exponensial de "+ valor1 + " = " + (resultadoFato));
//		
//	}
	// https://www.devmedia.com.br/arredondando-numeros-em-java/28248
	DecimalFormat numf = new DecimalFormat("#.000");
	
	switch(tipo) {
	case 1:
		double adicao = new operacao().adicao(valor1, valor2);
		System.out.println("Adicao de "+ valor1 + " + " + valor2 + " = " + (numf.format(adicao)));
		break;
	case 2:
		double subtracao = new operacao().divisao(valor1, valor2);
		System.out.println("subtracao de "+ valor1 + " - " + valor2 + " = " + (numf.format(subtracao)));
		break;
	case 3:
		double multiplicacao = new operacao().multiplicacao(valor1, valor2);
		System.out.println("multiplicacao de "+ valor1 + " x " + valor2 + " = " + (numf.format(multiplicacao)));
		break;
	case 4:
		double divisao = new operacao().divisao(valor1, valor2);
		System.out.println("divisao de "+ valor1 + " / " + valor2 + " = " + (numf.format(divisao)));
		break;
	case 5:
		double exponencial = new operacao().exponensial(valor1, valor2);
		System.out.println("Exponencial de "+ valor1 + " ^ " + valor2 + " = " + (exponencial));
		break;	
	case 6:
		double fatorial = new operacao().fatorial(valor1);
		System.out.println("fatorial de "+ valor1 + " = " + (fatorial));
		break;	
	default: System.out.println("Digite uma operação válida!");
	}

	}
}

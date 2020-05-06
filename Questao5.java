import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		float precoFinal,precoEtiqueta;
		int n;
		
		
		System.out.println("1-À vista em dinheiro ou cheque, com 10% de desconto ");
		System.out.println("\n2-À vista com cartão de crédito, com 5% de desconto ");
		System.out.println("\n3-Em 2 vezes, preço normal de etiqueta sem juros ");
		System.out.println("\n4-Em 3 vezes, preço de etiqueta com acréscimo de 10% ");
		System.out.println("\n-------------------------------------------------------- ");
		System.out.println("\nDigite numero da opção: ");
		
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		System.out.println("\nDigite o preço da etiqueta: ");
		precoEtiqueta = leitor.nextFloat();
		
		switch (n)
		{case 1:
			precoFinal = (float) (0.9*precoEtiqueta);
			System.out.println("O preço a pagar agora é: "+ precoFinal);
			System.out.println("O preço total é: "+ precoFinal);
			break;
		case 2:
			precoFinal = (float) (0.95*precoEtiqueta);
			System.out.println("O preço a pagar agora é: "+ precoFinal);
			System.out.println("O preço total é: "+ precoFinal);
			break;
		case 3:
			precoFinal = (float) (0.5*precoEtiqueta);
			System.out.println("O preço a pagar agora é: "+ precoFinal);
			System.out.println("O preço total é: "+ precoEtiqueta);
			break;
		case 4:
			precoFinal = (float) ((1.10/3)*precoEtiqueta);
			System.out.println("O preço a pagar agora é: "+ precoFinal);
			System.out.println("O preço total é: "+ 3*precoFinal);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}
		

	}

}

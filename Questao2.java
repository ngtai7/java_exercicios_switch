import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		int n,qtd;
		double preco;
		
		
		System.out.println("100-Cachorro Quente"+"\n101-Bauru Simples"+"\n102-Bauru com Ovo"+"\n103-Harmbúrguer"+"\n104-Cheeseburguer"+"\n105-Refrigerante"+"\n---------------------------------------------");
		System.out.println("\nDigite o código do produto: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		switch (n)
		{case 100:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*3.20;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		case 101:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*4.30;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		case 102:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*5.50;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		case 103:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*3.20;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		case 104:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*4.30;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		case 105:
			System.out.println("Digite a quantidade desejada: ");
			qtd = leitor.nextInt();
			preco = qtd*4.00;
			System.out.println("O valor a ser pago é: "+preco + "reais");
			break;
		default:
			System.out.println("Código inválido!!!");
		}
		

	}

}
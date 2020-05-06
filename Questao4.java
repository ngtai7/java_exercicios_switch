import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		float nota1,nota2,nota3;
		double MA,MP;
		int n;
		
		
		System.out.println("Opção 1-Média Aritmética"+"\nOpção 2-Média Ponderada"+"\n---------------------------------------------");
		System.out.println("\nDigite numero da opção: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		switch (n)
		{case 1:
			System.out.println("Digite a primeira nota: ");
			nota1 = leitor.nextFloat();
			System.out.println("Digite a segunda nota: ");
			nota2 = leitor.nextFloat();
			System.out.println("Digite a terceira nota: ");
			nota3 = leitor.nextFloat();
			MA = (nota1+nota2+nota3)/3;
			System.out.println("A média é: "+ MA);
			break;
		case 2:
			System.out.println("Digite a primeira nota: ");
			nota1 = leitor.nextFloat();
			System.out.println("Digite a segunda nota: ");
			nota2 = leitor.nextFloat();
			System.out.println("Digite a terceira nota: ");
			nota3 = leitor.nextFloat();
			MP = (3*nota1+3*nota2+4*nota3)/10;
			System.out.println("A média é: "+ MP);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}
		

	}

}
import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		float salarioAtual,salarioFinal;
		int n;
		
		
		System.out.println("001-Diretor");
		System.out.println("\n002-Engenheiro");
		System.out.println("\n003-Técnico");
		System.out.println("\n004-Gerente");
		System.out.println("\n005-Analista");
		System.out.println("\n006-Coordenador");
		System.out.println("\n-------------------------------------------------------- ");
		System.out.println("\nDigite código da opção: ");
		
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		System.out.println("\nDigite o seu salário atual: ");
		salarioAtual = leitor.nextFloat();
		
		switch (n)
		{case 001:
			salarioFinal = (float) (1.1*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.1*salarioAtual + " reais");
			break;
		case 002:
			salarioFinal = (float) (1.2*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.2*salarioAtual + " reais");
			break;
		case 003:
			salarioFinal = (float) (1.3*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.3*salarioAtual + " reais");
			break;
		case 004:
			salarioFinal = (float) (1.1*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.1*salarioAtual + " reais");
			break;
		case 005:
			salarioFinal = (float) (1.3*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.3*salarioAtual + " reais");
			break;
		case 006:
			salarioFinal = (float) (1.2*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.2*salarioAtual + " reais");
			break;
		default:
			salarioFinal = (float) (1.4*salarioAtual);
			System.out.println("O seu novo salário será:"+ salarioFinal + " reais");
			System.out.println("A diferença entre o novo e o antigo salário é:"+ 0.4*salarioAtual + " reais");
			break;
		}
		

	}

}
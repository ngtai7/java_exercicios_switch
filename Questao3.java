import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		int n;
		
		
		
		System.out.println("1"+"\n2"+"\n3"+"\n4"+"\n---------------------------------------------");
		System.out.println("\nDigite numero da opção: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		switch (n)
		{case 1:
			System.out.println("Executa a rotina de Inclusão de Alunos");
			break;
		case 2:
			System.out.println("Executa a rotina de Alteração de Alunos");
			break;
		case 3:
			System.out.println("Executa a rotina de Exclusão de Alunos");
			break;
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
			break;
		default:
			System.out.println("Código inválido!!!");
		}
		

	}

}

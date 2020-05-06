import java.util.Scanner;

public class ExerciciosAula05052020 {

	public static void main(String[] args) {
	    //Declaração de variável
		int n;
		
                System.out.println("001-Parafuso"+"\n002-Porca"+"\n003-Prego"+"\n004-Ferramenta"+"\n------------------------------")
		System.out.println("Digite o código do produto: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		switch (n)
		{case 001:
			System.out.println("Parafuso");
			break;
		case 002:
			System.out.println("Porca");
			break;
		case 003:
			System.out.println("Prego");
			break;
		case 004:
			System.out.println("Ferramenta");
			break;
		default:
			System.out.println("Código inválido!!!");
		}
		

	}

}
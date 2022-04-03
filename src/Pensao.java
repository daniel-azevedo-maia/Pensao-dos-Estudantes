import java.util.Locale;
import java.util.Scanner;

public class Pensao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Quarto[] quartos = new Quarto[10];
		
		System.out.println("Sejam bem vindos � pens�o!\n");
		
		System.out.print("Quantos estudantes v�o alugar quartos? ");
		int numero_estudantes = sc.nextInt();
		
		while (numero_estudantes < 1 && numero_estudantes > 10) {
			System.out.println("Valor inv�lido! S� � poss�vel cadastrar at� 10 estudantes.");
			System.out.print("Quantos estudantes v�o alugar quartos? ");
			numero_estudantes = sc.nextInt();
		}
		
		System.out.println("Iniciando cadastro!\n");
		
		for (int i = 0; i < numero_estudantes; i++) {
			
			sc.nextLine();
			
			System.out.printf("Cadastrando o %d� estudante...\n\n", i + 1);
			System.out.printf("Informe o nome do %d� estudante: ", i + 1);
			String nome = sc.nextLine();
			System.out.printf("Informe o e-mail do %d� estudante: ", i + 1);
			String email = sc.nextLine();
			System.out.printf("Em qual quarto o %d� estudante vai se hospedar? ", i + 1);
			int numero_quarto = sc.nextInt();
			System.out.printf("\n%d� estudante cadastrado!\n\n", i + 1);
			quartos[i] = new Quarto(nome, email, numero_quarto);
			
		}
		System.out.println("==============================================");
		System.out.println("QUARTOS OCUPADOS: \n");
		for (int i = 0; i < numero_estudantes; i++) {
			
			System.out.printf("\t* Quarto n� %d: %s, %s\n", quartos[i].getNumero_quarto(), quartos[i].getNome(), quartos[i].getEmail());
		}
		System.out.println("==============================================");
		
		sc.close();
	}

}
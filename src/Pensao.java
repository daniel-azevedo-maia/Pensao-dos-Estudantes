import java.util.Locale;
import java.util.Scanner;

public class Pensao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Quarto[] quartos = new Quarto[10];
		
		System.out.println("Sejam bem vindos à pensão!\n");
		
		System.out.print("Quantos estudantes vão alugar quartos? ");
		int numero_estudantes = sc.nextInt();
		
		while (numero_estudantes < 1 && numero_estudantes > 10) {
			System.out.println("Valor inválido! Só é possível cadastrar até 10 estudantes.");
			System.out.print("Quantos estudantes vão alugar quartos? ");
			numero_estudantes = sc.nextInt();
		}
		
		System.out.println("Iniciando cadastro!\n");
		
		for (int i = 0; i < numero_estudantes; i++) {
			
			sc.nextLine();
			
			System.out.printf("Cadastrando o %dº estudante...\n\n", i + 1);
			System.out.printf("Informe o nome do %dº estudante: ", i + 1);
			String nome = sc.nextLine();
			System.out.printf("Informe o e-mail do %dº estudante: ", i + 1);
			String email = sc.nextLine();
			System.out.printf("Em qual quarto o %dº estudante vai se hospedar? ", i + 1);
			int numero_quarto = sc.nextInt();
			System.out.printf("\n%dº estudante cadastrado!\n\n", i + 1);
			quartos[i] = new Quarto(nome, email, numero_quarto);
			
		}
		System.out.println("==============================================");
		System.out.println("QUARTOS OCUPADOS: \n");
		for (int i = 0; i < numero_estudantes; i++) {
			
			System.out.printf("\t* Quarto nº %d: %s, %s\n", quartos[i].getNumero_quarto(), quartos[i].getNome(), quartos[i].getEmail());
		}
		System.out.println("==============================================");
		
		sc.close();
	}

}
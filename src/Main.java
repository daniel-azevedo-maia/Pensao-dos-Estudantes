import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        System.out.println("Sejam bem-vindos à pensão!\n");

        int numeroEstudantes;
        do {
            System.out.print("Quantos estudantes vão alugar quartos? (1-10): ");
            numeroEstudantes = sc.nextInt();
            if (numeroEstudantes < 1 || numeroEstudantes > 10) {
                System.out.println("Número inválido! Só é possível cadastrar entre 1 e 10 estudantes.");
            }
        } while (numeroEstudantes < 1 || numeroEstudantes > 10);

        System.out.println("\nIniciando cadastro!\n");

        // Cadastro dos estudantes
        for (int i = 0; i < numeroEstudantes; i++) {
            sc.nextLine(); // Limpa o buffer

            System.out.printf("Cadastrando o %dº estudante...\n\n", i + 1);
            System.out.print("Informe o nome do estudante: ");
            String nome = sc.nextLine();

            System.out.print("Informe o e-mail do estudante: ");
            String email = sc.nextLine();

            int numeroQuarto;
            do {
                System.out.print("Informe o número do quarto (0-9): ");
                numeroQuarto = sc.nextInt();
                if (numeroQuarto < 0 || numeroQuarto >= quartos.length) {
                    System.out.println("Número de quarto inválido! Escolha entre 0 e 9.");
                } else if (quartos[numeroQuarto] != null) {
                    System.out.println("O quarto já está ocupado! Escolha outro.");
                }
            } while (numeroQuarto < 0 || numeroQuarto >= quartos.length || quartos[numeroQuarto] != null);

            // Alocar o estudante no quarto
            quartos[numeroQuarto] = new Quarto(nome, email, numeroQuarto);
            System.out.printf("\nEstudante %d cadastrado com sucesso!\n\n", i + 1);
        }

        // Exibir quartos ocupados
        exibirQuartosOcupados(quartos);

        sc.close();
    }

    // Método para exibir os quartos ocupados
    private static void exibirQuartosOcupados(Quarto[] quartos) {
        System.out.println("==============================================");
        System.out.println("QUARTOS OCUPADOS: \n");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.printf("Quarto nº %d: %s, %s\n",
                        quartos[i].getNumeroQuarto(), quartos[i].getNome(), quartos[i].getEmail());
            }
        }
        System.out.println("==============================================");
    }
}

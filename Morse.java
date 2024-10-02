import java.util.Scanner;

public class Morse {

    public static void main(String[] args) {

        // inicializando a arvore e inserindo os caracteres
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        arvore.inserir(".-", 'A');
        arvore.inserir("-...", 'B');
        arvore.inserir("-.-.", 'C');
        arvore.inserir("-..", 'D');
        arvore.inserir(".", 'E');
        arvore.inserir("..-.", 'F');
        arvore.inserir("--.", 'G');
        arvore.inserir("....", 'H');
        arvore.inserir("..", 'I');
        arvore.inserir(".---", 'J');
        arvore.inserir("-.-", 'K');
        arvore.inserir(".-..", 'L');
        arvore.inserir("--", 'M');
        arvore.inserir("-.", 'N');
        arvore.inserir("---", 'O');
        arvore.inserir(".--.", 'P');
        arvore.inserir("--.-", 'Q');
        arvore.inserir(".-.", 'R');
        arvore.inserir("...", 'S');
        arvore.inserir("-", 'T');
        arvore.inserir("..-", 'U');
        arvore.inserir("...-", 'V');
        arvore.inserir(".--", 'W');
        arvore.inserir("-..-", 'X');
        arvore.inserir("-.--", 'Y');
        arvore.inserir("--..", 'Z');
        arvore.inserir(".----", '1');
        arvore.inserir("..---", '2');
        arvore.inserir("...--", '3');
        arvore.inserir("....-", '4');
        arvore.inserir(".....", '5');
        arvore.inserir("-....", '6');
        arvore.inserir("--...", '7');
        arvore.inserir("---..", '8');
        arvore.inserir("----.", '9');
        arvore.inserir("-----", '0');

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Buscar Código Morse");
            System.out.println("2. Exibir Árvore Morse");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    // caso escolha buscar o codigo
                    System.out.println("Digite o código Morse (use espaços para separar letras): ");
                    String codigoMorse = scanner.nextLine();
                    String resultado = arvore.buscar(codigoMorse);
                    if (resultado != null) {
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Código Morse inválido.");
                    }
                    break;
                case 2:
                    // caso escolha exibir a arvore
                    System.out.println("Exibindo Árvore Morse:");
                    arvore.exibirArvore();
                    break;
                case 3:
                    // caso escolha sair
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

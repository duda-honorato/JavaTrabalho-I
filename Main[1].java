import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] empresa = new Pessoa[100];
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Fornecedor");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Folha de Pagamento");
            System.out.println("4. Contas a Pagar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                if (cont < empresa.length) {
                    System.out.println("Informe o nome do Fornecedor: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o telefone do Fornecedor: ");
                    String telefone = scanner.nextLine();
                    System.out.println("Informe o valor de crédito: ");
                    double valorCredito = scanner.nextDouble();
                    System.out.println("Informe o valor de dívida: ");
                    double valorDivida = scanner.nextDouble();
                    scanner.nextLine();

                    Fornecedor fornecedor = new Fornecedor(nome, telefone, valorCredito, valorDivida);
                    empresa[cont] = fornecedor;
                    cont++;
                } else {
                    System.out.println("Não é possível adicionar mais fornecedores.");
                }
            } else if (escolha == 2) {
                if (cont < empresa.length) {
                    System.out.println("Informe o nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.println("Informe o codigo do setor: ");
                    int codigoSetor = scanner.nextInt();
                    System.out.println("Informe o salario base: ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    Empregado empregado = new Empregado(nome, telefone, codigoSetor, salarioBase, 10);
                    empresa[cont] = empregado;
                    cont++;
                } else {
                    System.out.println("Não é possível adicionar mais fornecedores.");
                }
            } else if (escolha == 3) {
                System.out.println();
            } else if (escolha == 4) {
                for (Pessoa currentPessoa : empresa) {
                    if (currentPessoa instanceof Fornecedor) {
                        System.out.println(currentPessoa);
                    }
                }
            } else if (escolha == 5) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

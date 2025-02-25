import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] empresa = new Pessoa[100];
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar Fornecedor");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Folha de Pagamento");
            System.out.println("4. Contas a Pagar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {  
                System.out.println("Opção inválida! Digite um número.");
                scanner.next();
                continue;
            }
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            if (escolha == 1) {  
                if (cont < empresa.length) {
                    System.out.print("Informe o nome do Fornecedor: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o telefone do Fornecedor: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Informe o valor de crédito: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido! Tente novamente.");
                        scanner.next();
                        continue;
                    }
                    double valorCredito = scanner.nextDouble();

                    System.out.print("Informe o valor de dívida: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido! Tente novamente.");
                        scanner.next();
                        continue;
                    }
                    double valorDivida = scanner.nextDouble();
                    scanner.nextLine();

                    empresa[cont++] = new Fornecedor(nome, telefone, valorCredito, valorDivida);
                    System.out.println("Fornecedor adicionado com sucesso!");
                } else {
                    System.out.println("Capacidade máxima atingida! Não é possível adicionar mais fornecedores.");
                }
            } else if (escolha == 2) {  
                if (cont < empresa.length) {
                    System.out.print("Informe o nome do Funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Informe o código do setor: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Código inválido! Tente novamente.");
                        scanner.next();
                        continue;
                    }
                    int codigoSetor = scanner.nextInt();

                    System.out.print("Informe o salário base: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Salário inválido! Tente novamente.");
                        scanner.next();
                        continue;
                    }
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    empresa[cont++] = new Empregado(nome, telefone, codigoSetor, salarioBase, 10);
                    System.out.println("Funcionário adicionado com sucesso!");
                } else {
                    System.out.println("Capacidade máxima atingida! Não é possível adicionar mais funcionários.");
                }
            } else if (escolha == 3) { 
                System.out.println("\n=== FOLHA DE PAGAMENTO ===");
                boolean encontrou = false;
                for (Pessoa p : empresa) {
                    if (p instanceof Empregado) {
                        System.out.println(p);
                        encontrou = true;
                    }
                }
                if (!encontrou) {
                    System.out.println("Nenhum funcionário cadastrado.");
                }
            } else if (escolha == 4) { 
                System.out.println("\n=== CONTAS A PAGAR ===");
                boolean encontrou = false;
                for (Pessoa p : empresa) {
                    if (p instanceof Fornecedor) {
                        System.out.println(p);
                        encontrou = true;
                    }
                }
                if (!encontrou) {
                    System.out.println("Nenhum fornecedor cadastrado.");
                }
            } else if (escolha == 5) {  // Sair do programa
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida! Escolha um número entre 1 e 5.");
            }
        }
        scanner.close();
    }
}

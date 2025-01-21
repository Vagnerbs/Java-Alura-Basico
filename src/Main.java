import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        String tipoDeConta;
        double saldoInicial = 0;
        String saldo;
        boolean verificarTipo = false;
        boolean sair = false;
        int opcao = 0;
        double movimento;

        Scanner scanner = new Scanner(System.in);

        //Receber nome
        do {
            System.out.println("Digite seu nome ou 'S' para sair: ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("s")) {
                System.out.println("Encerrando...");
                System.exit(0);
            }
            verificarTipo = VerificarTipos.verificaAlpha(nome);
            if (!verificarTipo || nome.isEmpty()){
                System.out.println("Preenchimento obrigatorio! Não é permitodo numero! Digite 'S' para sair!");
                verificarTipo = false;
            }
        } while(!verificarTipo);

        //Receber tipo de conta
        do {
            System.out.println("Digite : 1 Conta corrente \n " +
                    "        2 Conta Poupança \n" +
                    "         ou 'S' sair");
            tipoDeConta = scanner.nextLine();
            if (tipoDeConta.equalsIgnoreCase("s")) {
                System.out.println("Encerrando...");
                System.exit(0);
            }

            if (tipoDeConta.equals("1") || tipoDeConta.equals("2")) {
                verificarTipo = true;
            }else {
                System.out.println("Preenchimento Ivalido! Digite 1, 2 ou 'S' para sair!");
                verificarTipo = false;
            }
        } while(!verificarTipo);

        //Recebendo saldo inicial
        do {
            System.out.println("Digite o Saldo Inicial ou 'S' para sair: ");
            saldo = scanner.nextLine();
            if (saldo.equalsIgnoreCase("s")) {
                System.out.println("Encerrando...");
                System.exit(0);
            }
            if (saldo.isEmpty()){
                System.out.println("Entrada não pode ser vazia. Por favor, digite um valor numérico.");
                verificarTipo = false;
            } else {
                try {
                    saldoInicial = Double.parseDouble(saldo);
                    verificarTipo = true;
                } catch (NumberFormatException e){
                    System.out.println("Não é permitido letra");
                    verificarTipo = false;
                }
            }
        } while(!verificarTipo);

        System.out.println("******************************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.printf("%-15s: %s\n", "Nome", nome);
        System.out.printf("%-15s: %s\n", "Tipo conta", tipoDeConta);
        System.out.printf("%-15s: %.2f\n", "Saldo inicial", saldoInicial);
        System.out.println("******************************************************");

        System.out.println("\nOperações:\n");

        do {
            System.out.println("""
                    1-Consultar saldo:
                    2-Receber valor
                    3-Transferir valor
                    4-Sair
                    """ );
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("\n******************************************************");
                    System.out.println("Saldo atual: " + saldoInicial);
                    System.out.println("******************************************************\n");
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    movimento = scanner.nextDouble();
                    scanner.nextLine();
                    saldoInicial += movimento;
                    break;
                case 3:
                    System.out.println("Digite o valor: ");
                    movimento = scanner.nextDouble();
                    scanner.nextLine();
                    saldoInicial -= movimento;
                    break;
                case 4:
                    System.out.println("Saindo... ");
                    sair = true;
                    break;
                default:
                    System.out.println("Valor invalido! Digite novamente");
                    sair = false;
                    break;
            }
        }while (!sair);
    }
}
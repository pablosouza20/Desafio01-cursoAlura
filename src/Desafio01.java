import java.util.Scanner;
public class Desafio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome=" ", tipoConta=" ", menu=" ", opcaoPix=" ";
        double saldo, transferir=0, receberValor=0, pagamento=0;
        int opcao = 0;

        System.out.println("Nome do cliente ");
        nome = ler.nextLine();
        System.out.println("Tipo da conta ");
        tipoConta = ler.nextLine();
        System.out.println("Saldo ");
        saldo = ler.nextDouble();

        while (opcao != 5){
            System.out.println("\nDigite uma opção\n" +
                               "1 - Extrato\n" +
                               "2 - Pagamento\n" +
                               "3 - Pix - transferir valor\n" +
                               "4 - Pix - receber valor\n" +
                               "5 - Sair\n");
            opcao = ler.nextInt();

            if (opcao == 1){
                System.out.printf("Extrato do seu saldo R$ %.2f\n", saldo);
            } else if (opcao == 2) {
                System.out.println("Pagamento R$");
                pagamento = ler.nextDouble();
                if (pagamento > saldo){
                    System.out.println("Saldo insuficiente para realizar pagamento!");
                }else {
                    saldo -= pagamento;
                    System.out.println("Novo saldo atualizado");
                  }
            } else if (opcao == 3){
                System.out.println("Opção PIX selecionado.\nTransferir valor R$ ");
                transferir = ler.nextDouble();
                saldo -= transferir;
                System.out.println("Novo saldo atualizado");
            }else if (opcao == 4){
                System.out.println("Opção PIX selecionado.\nReceber valor R$ ");
                receberValor = ler.nextDouble();
                saldo = saldo + receberValor;
                System.out.println("Novo saldo atualizado");
            } if (opcao == 5) {
                System.out.println("Sair do programa!");
            }
        }
    }
}

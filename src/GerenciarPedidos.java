import java.util.Scanner;

public class GerenciarPedidos {

    Scanner scanner = new Scanner(System.in);
    PedidoService pedidoService = new PedidoService();

    public void confirmarEntrega() {

        System.out.println("Pedidos: " + pedidoService.listarPedidos());
        System.out.println("Digite o id do Pedido");
        int idPedido = scanner.nextInt();
        scanner.nextLine();

        pedidoService.AlterarStatusDoPedido(idPedido);

    }

    public void inserirPedido() {
        System.out.println("Digite o nome do cliente");
        String descricaoPedido = scanner.nextLine();

        while (true) {

            System.out.println("Digite o endereço para entrega");
            String endereco = scanner.nextLine();

            System.out.println("Dados do pedido, descrição: "+ descricaoPedido + ", endereço: " + endereco );
            System.out.println("Digite 1 para confirmar o pedido ou 0 para editar o pedido");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch(opcao) {
                    case 1:
                        confirmarPedido(descricaoPedido, endereco);
                        return;
                    case 0:
                        continue;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("entrada inválida! Por favor, insira um número" + exception);
            }
        }

    }
    public void confirmarPedido(String nomeCliente, String endereco) {

        final double preco = 120;

        System.out.println("Digite quantos botijões deseja pedir");
        System.out.println("Preço do botijão:" + preco);

        int quantidadebotijao = scanner.nextInt();
        scanner.nextLine();
        double valorTotal = preco * quantidadebotijao;

        System.out.println("Digite a o numero do cartão para pagamento");
        String formaPagamnento = scanner.nextLine();
        Pedido pedido = new Pedido(endereco, nomeCliente, valorTotal, formaPagamnento);
        pedidoService.FazerPedido(pedido);

        System.out.println("Pedido inserido com sucesso!");
    }
}

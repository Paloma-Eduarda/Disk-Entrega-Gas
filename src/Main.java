import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciarPedidos gerenciarPedidos = new GerenciarPedidos();
        PedidoService pedidoService = new PedidoService();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Inserir pedido");
            System.out.println("2. Ver pedidos confirmados");
            System.out.println("3. Ver pedidos Entregues ");
            System.out.println("4. Confirmar uma entrega");
            System.out.println("5. Listar todos os pedidos");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch(opcao) {
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    case 1:
                        gerenciarPedidos.inserirPedido();
                        break;
                    case 2:
                        System.out.println(pedidoService.listarPedidosConfirmados());
                       break;
                    case 3:
                        System.out.println(pedidoService.listarPedidosEntregues());
                        break;
                    case 4:
                        gerenciarPedidos.confirmarEntrega();
                        break;
                    case 5:
                        System.out.println("Pedidos: " + pedidoService.listarPedidos() );
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("entrada inválida! Por favor, insira um número" + exception);
            }
        }

    }



}
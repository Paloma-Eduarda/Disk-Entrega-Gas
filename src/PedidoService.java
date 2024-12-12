import java.util.ArrayList;
import java.util.List;

public class PedidoService implements IPedido{

    static List<Pedido> pedidos = new ArrayList<Pedido>();

    public void FazerPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public List<Pedido> listarPedidos(){
        return pedidos;
    }

    public  List<Pedido> listarPedidosConfirmados() {

        List<Pedido> pedidosConfirmados = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getStatusPedido().equals("CONFIRMADO")) {
                pedidosConfirmados.add(pedido);
            }
        }
        return pedidosConfirmados;
    }

    public  List<Pedido> listarPedidosEntregues() {
        List<Pedido> pedidosEntregues = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getStatusPedido().equals("ENTREGUE")) {
                pedidosEntregues.add(pedido);
                System.out.println(pedido);
            }
        }
        return pedidosEntregues;

    }
    public  void AlterarStatusDoPedido(int id){
        for(Pedido pedido : pedidos){
            if(pedido.getCodigo() == id){
                pedido.setStatusPedido("ENTREGUE");
                System.out.println("Status do Pedido alterado com sucesso");
            }else{
                System.out.println("Pedido Não encontrado!");
            }
        }
    }
}

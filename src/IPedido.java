import java.util.List;

public interface IPedido {

    void FazerPedido(Pedido pedido);

    List<Pedido> listarPedidos();

    List<Pedido> listarPedidosConfirmados();

    List<Pedido> listarPedidosEntregues();

    void AlterarStatusDoPedido(int id);
}

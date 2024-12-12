import java.time.LocalTime;

public class Pedido {
    private static int contador = 0;
    private int codigo;
    private String nomeCliente;
    private LocalTime horaDoPedido;
    private String enderecoEntrega;
    private String statusPedido;
    private Double valorDaCompra;
    private LocalTime horaEntrega;
    private String formaPagamento;

    public Pedido(String endereco, String nomeCliente, Double valorDaCompra, String formaPagamento) {
        this.codigo = contador++;
        this.enderecoEntrega = endereco;
        this.horaEntrega = LocalTime.now(); //alterar
        this.nomeCliente = nomeCliente;
        this.horaDoPedido = LocalTime.now();;
        this.statusPedido = "CONFIRMADO";
        this.valorDaCompra = valorDaCompra;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public LocalTime getHoraDoPedido() {
        return horaDoPedido;
    }

    public void setHoraDoPedido(LocalTime horaDoPedido) {
        this.horaDoPedido = horaDoPedido;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public String toString() {
        return "Pedido:" +
                "codigo=" + codigo +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", horas=" + horaDoPedido +
                ", endereco='" + enderecoEntrega + '\'' +
                ", status='" + statusPedido + '\'' +
                ", valorDaCompra=" + valorDaCompra +
                ", horaEntrega=" + horaEntrega + '\n';
    }
}

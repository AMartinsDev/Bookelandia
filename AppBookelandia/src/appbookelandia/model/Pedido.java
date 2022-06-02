
package appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    
    private int numero_do_pedido;
    private Cliente cliente;
    private FormaDePagamento pagamento;
    private boolean status;
    private LocalDate data;
    private String cupom;
    private double valor_total;
    private ArrayList<ProdutoPedido> produtos;
    
    public Pedido(){
        this.produtos = new ArrayList<ProdutoPedido>();
    }
    
    public Pedido (int numero_do_pedido){
        this.numero_do_pedido = numero_do_pedido;
        this.produtos = new ArrayList<ProdutoPedido>();
    }
    
    public void adicionaProduto(Produto p, int quantidade){
        ProdutoPedido produto_pedido = new ProdutoPedido(p,quantidade);
        this.produtos.add(produto_pedido);
    }
    
    public double calculaValorTotal(){
        double valor_total = 0.0;
        for(ProdutoPedido pp : this.produtos){
            Produto p = pp.getProduto();
            int quantidade = pp.getQuantidade();
            valor_total = valor_total + (p.getPreco()*quantidade);
        }
        return valor_total;
    }
    
    public int getNumero_do_pedido() {
        return numero_do_pedido;
    }

    public void setNumero_do_pedido(int numero_do_pedido) {
        this.numero_do_pedido = numero_do_pedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pagamento
     */
    public FormaDePagamento getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(FormaDePagamento pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @return the cupom
     */
    public String getCupom() {
        return cupom;
    }

    /**
     * @param cupom the cupom to set
     */
    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    /**
     * @return the valor_total
     */
    public double getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
          
}

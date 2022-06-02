
package appbookelandia.model;

public class ProdutoPedido {
    
    private int numero_do_pedido;
    private Produto produto;
    private int quantidade;

    public ProdutoPedido(){}
    
    public ProdutoPedido(Produto produto){
        this.produto = produto;
    }
    
    public ProdutoPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    /**
     * @return the numero_do_pedido
     */
    public int getNumero_do_pedido() {
        return numero_do_pedido;
    }

    /**
     * @param numero_do_pedido the numero_do_pedido to set
     */
    public void setNumero_do_pedido(int numero_do_pedido) {
        this.numero_do_pedido = numero_do_pedido;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}

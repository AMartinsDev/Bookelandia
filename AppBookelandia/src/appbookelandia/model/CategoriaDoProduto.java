package appbookelandia.model;

public class CategoriaDoProduto {
    
    private int codigo_do_produto;
    private String nome_do_produto;
    private String descricao;

    public int getCodigo_do_produto() {
        return codigo_do_produto;
    }

    public void setCodigo_do_produto(int codigo_do_produto) {
        this.codigo_do_produto = codigo_do_produto;
    }

    public String getNome_do_produto() {
        return nome_do_produto;
    }

    public void setNome_do_produto(String nome_do_produto) {
        this.nome_do_produto = nome_do_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}

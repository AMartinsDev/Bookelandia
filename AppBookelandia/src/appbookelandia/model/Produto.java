package appbookelandia.model;

public class Produto {
    
    private int codigo_do_produto;
    private CategoriaDoProduto codigo_da_categoria;
    private String nome;
    private String descricao;
    private double preco;

    //Alguns construtores que poderão ser usados no futuro;
    public Produto(){}
    
    public Produto(int codigo_do_produto){
        this.codigo_do_produto = codigo_do_produto;
    }
    
    public Produto(int codigo_do_produto, String nome){
        this.codigo_do_produto = codigo_do_produto;
        this.nome = nome;
    }
    
     public Produto(int codigo_do_produto, String nome, double preco){
        this.codigo_do_produto = codigo_do_produto;
        this.nome = nome;
        this.preco = preco;
    }
    
    public int getCodigo_do_produto() {
        return codigo_do_produto;
    }

    public void setCodigo_do_produto(int codigo_do_produto) {
        this.codigo_do_produto = codigo_do_produto;
    }

    public CategoriaDoProduto getCodigo_da_categoria() {
        return codigo_da_categoria;
    }

    public void setCodigo_da_categoria(CategoriaDoProduto codigo_da_categoria) {
        this.codigo_da_categoria = codigo_da_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }  
    
}

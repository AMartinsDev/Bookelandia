package appbookelandia.model;

public enum FormaDePagamento {
    
    Debito("débito"),
    Credito("crédito"),
    Boleto("boleto");
    
    private final String descricao;
    
    //Um construtor que passa uma descrição para o enum
    FormaDePagamento (String descricao){
        this.descricao = descricao;
    }
    
    //Metodo para retornar essa descricao em algum outro lugar
    public String descricao(){  
    return descricao;
    }
    
}

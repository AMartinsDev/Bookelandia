package appbookelandia.model;

import java.time.LocalDate;

public class Cliente {
    
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate data_de_cadastro;
    
    
    //CONSTRUTORES
    public Cliente(){
        this.setData_de_cadastro(LocalDate.now());
    }
    
    public Cliente(String cpf){
        this.setData_de_cadastro(LocalDate.now());
        this.setCpf(cpf);
    }
    
    public Cliente(LocalDate now, String cpf, String nome){
        this.setData_de_cadastro(LocalDate.now());
        this.setCpf(cpf);
        this.nome = nome;
    }
    //FIM DOS CONSTRUTORES
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

 
    public String getEndereco() {
        return endereco;
    }

 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

  
    public LocalDate getData_de_cadastro() {
        return data_de_cadastro;
    }

  
    public void setData_de_cadastro(LocalDate data_de_cadastro) {
        this.data_de_cadastro = data_de_cadastro;
    }
    
    
}

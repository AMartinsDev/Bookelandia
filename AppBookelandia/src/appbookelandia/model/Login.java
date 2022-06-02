package appbookelandia.model;

public class Login {
    
    private String email;
    private String senha;
    private NivelDeAcesso nivel_de_acesso;
    private Boolean status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length() <= 20){
        this.senha = senha;
        }
        
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public NivelDeAcesso getNivel_de_acesso() {
        return nivel_de_acesso;
    }

    public void setNivel_de_acesso(NivelDeAcesso nivel_de_acesso) {
        this.nivel_de_acesso = nivel_de_acesso;
    }
    
}



package appbookelandia.model;

import java.time.LocalDate;

public abstract class Funcionario{
    
    protected int matricula;
    protected String nome;
    protected LocalDate data_de_admissao;
    protected String cargo;
    protected double salario;
    
    protected Funcionario (String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return this.cargo;
    }
}

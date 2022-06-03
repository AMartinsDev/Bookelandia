package appbookelandia.dal;

import appbookelandia.model.Cliente;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class ClienteDAO implements ICrud<Cliente>{
    
    private Conexao conexao;
    
    public ClienteDAO(){
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException{
        //cria a string de consulta
        String sql = "select cpf, nome, telefone, endereço, dataDeCadastro from clientes where cpf = ?;";
        //cria a declaraçao sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        //Inclui o parâmetro de consulta na declaraçao sql
        ps.setString(1, id);
        //execeuta a consulta no BD
        ps.execute();
        
        //Recupera os dados do BD
        ResultSet resultado = ps.getResultSet();
        //Move o cursor do BD para a próxima linha (1 linha da tabela)
        resultado.next();
        
        
        //Crio o objeto cliente para ser preenchido com os dados do BD
        Cliente c = new Cliente();
        c.setCpf(resultado.getString("cpf"));
        c.setNome(resultado.getString("nome"));
        c.setTelefone(resultado.getString("telefone"));
        c.setData_de_cadastro(resultado.getDate("dataDeCadastro").toLocalDate());
        c.setEndereco(resultado.getString("endereço"));
        
        //Fecha a conexao
        conexao.fecha();
        
        //Devolve o objeto cliente preenchido
        return c;
    }
    

    @Override
    public void adiciona(Cliente t) throws SQLException {

        String sql = "insert into clientes (cpf,nome,telefone,endereço,dataDeCadastro) values(?,?,?,?,?);";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1,t.getCpf());
        ps.setString(2,t.getNome());
        ps.setString(3,t.getTelefone());
        ps.setString(4, t.getEndereco());
        ps.setDate(5, Date.valueOf(t.getData_de_cadastro()));
        
        ps.execute();
        conexao.fecha();
        }

    @Override
    public void altera(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exclui(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

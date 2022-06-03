package appbookelandia.controler;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.*;
import appbookelandia.view.FrmCadCliente;
import java.time.LocalDate;
import java.util.Arrays;
import java.sql.SQLException;

/**
 * @author Arthur
 */
public class ControllerCadClientes {

    private FrmCadCliente view;

    public ControllerCadClientes(FrmCadCliente view) {
        this.view = view;
    }

    public ControllerCadClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastraCliente() throws SQLException {

        Cliente c = new Cliente();
        c.setNome(view.getTxtNomeCliente().getText());
        c.setCpf(view.getTxtCpfCliente().getText());
        c.setEndereco(view.getTxtEndCliente().getText());
        c.setTelefone(view.getTxtTelCliente().getText());
        c.setData_de_cadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.adiciona(c);

        Login log = new Login();
        log.setEmail(view.getTxtEmailCliente().getText());
        log.setSenha(Arrays.toString(view.getTxtSenhaCliente().getPropertyChangeListeners()));
        log.setNivel_de_acesso(NivelDeAcesso.Cliente);

    }

    public void limpaTela() {
        view.getTxtCpfCliente().setText("");
        view.getTxtNomeCliente().setText("");
        view.getTxtEmailCliente().setText("");
        view.getTxtSenhaCliente().setText("");
        view.getTxtTelCliente().setText("");
        view.getTxtEndCliente().setText("");
    }

    
    public void alteraCliente() throws SQLException{
        Cliente c = new Cliente();
        c.setNome(view.getTxtNomeCliente().getText());
        c.setCpf(view.getTxtCpfCliente().getText());
        c.setEndereco(view.getTxtEndCliente().getText());
        c.setTelefone(view.getTxtTelCliente().getText());
        c.setData_de_cadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.altera(c);
    }
    
    
    public void consultaCliente() throws SQLException {
        String cpf = view.getTxtCpfCliente().getText();

        Cliente c;
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);

        if (cliente != null) {
            view.getTxtNomeCliente().setText(cliente.getNome());
            view.getTxtEndCliente().setText(cliente.getEndereco());
            view.getTxtTelCliente().setText(cliente.getTelefone());
        }
    }

    /*public void excluiCliente() throws SQLException {

        Cliente c = new Cliente();
        c.setNome(view.getTxtNomeCliente().getText());
        c.setCpf(view.getTxtCpfCliente().getText());
        c.setEndereco(view.getTxtEndCliente().getText());
        c.setTelefone(view.getTxtTelCliente().getText());
        c.setData_de_cadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.exclui(c);
    }
    */
}
        
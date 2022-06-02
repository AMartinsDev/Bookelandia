package appbookelandia.dal;

import java.sql.SQLException;

public interface ICrud<T> {
    
    T recupera(String t) throws SQLException;
    
    void adiciona(T t) throws SQLException;
    
    void altera(T t) throws SQLException;
    
    void exclui(T t) throws SQLException;
    
}

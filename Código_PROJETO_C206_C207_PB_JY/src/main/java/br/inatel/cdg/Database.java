/* package br.inatel.cdg;

import java.sql.*;

public abstract class Database {
    Connection connection;   // objeto responsável por fazer a conexão com o servidor do MySQL
    Statement statement;     // objeto responsável por preparar consultas "SELECT"
    ResultSet result;        // objeto responsável por executar consultas "SELECT"
    PreparedStatement pst;   // objeto responsável por preparar querys de manipulação dinâmicas (INSERT, UPDATE, DELETE)

    static final String aluno = "root";                  // usuário da instância local do servidor
    static final String password = "/MS-DOSV.6.22b";    // senha do usuário da instância local do servidor
    static final String database = "exercicio";           // nome do banco de dados a ser utilizado

    // string com URL de conexão com servidor
    static final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public boolean check = false;

    public void connect(){
        try {
            connection = DriverManager.getConnection(url, aluno, password);
            System.out.println("Conexão feita com sucesso: "+ connection);
        }catch (SQLException e){
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }


 */
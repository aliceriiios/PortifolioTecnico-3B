package locadora;


 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;

 
public class Banco {
    private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "senai";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    public static void salvar (Cliente cliente){
        try{
            Connection con =Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Cliente (cpf, nome, telefone, endereco) values(?, ?, ?, ?)");
            ps.setInt(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getEndereco());
         
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void salvar (Dvd dvd){
        try{
            Connection con =Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Dvd (cod, titulo, estoque, diretor, producao, genero, prazo) values(?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, dvd.getCod());
            ps.setString(2, dvd.getTitulo());
            ps.setInt(3, dvd.getEstoque());
            ps.setString(4, dvd.getDiretor());
            ps.setString(5, dvd.getProducao());
            ps.setString(6, dvd.getGenero());
            ps.setString(7, dvd.getPrazo());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param cpf
     */
    public static void deleta_cliente(int cpf){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM cliente WHERE id = ?");
            ps.setInt(1, cpf);
            ps.executeUpdate();

            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleta_dvd(int cod){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM dvd WHERE id = ?");
            ps.setInt(1, cod);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaBanco(Cliente cliente){
        deleta_cliente(cliente.getCpf());
        salvar(cliente);
    }
    public static void atualizaBanco(Dvd dvd){
        deleta_dvd(dvd.getCod());
        salvar(dvd);
    }
    
    public static void visualiza_tabela (String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM " + tabela);
            ResultSet rs = ps.executeQuery();
            
            String valor = "";
            while(rs.next()){
                for (String i : atributo){
                    valor = valor + " | " + rs.getString(i);
                }
                valor = valor + "\n";
            }
            System.out.println(valor);
            
        } catch (SQLException e){
          e.printStackTrace();
        }
        }
    public static void cria_tabela (String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            String comando = "CREATE TABLE " + tabela + " (";
            
            for (String i : atributo){
                comando = comando + i + ",";
            }
            comando = comando.substring(0, comando.length()-1);
            comando = comando + ");";
            
            System.out.println(comando);
            
            PreparedStatement ps = con.prepareStatement(comando);
            ps.execute();
            
        } catch (SQLException e) {
        }
    }

 }

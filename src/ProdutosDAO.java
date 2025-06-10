
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        
        
        return listagem;
    }
    
     public void venderProduto(int idProduto) {
        try {
            conn = new conectaDAO().connectDB(); // Conectando ao banco

            String sql = "UPDATE produto SET status = ? WHERE id = ?";
            prep = conn.prepareStatement(sql);
            prep.setString(1, "Vendido"); // Novo status
            prep.setInt(2, idProduto);    // ID do produto a ser vendido

            prep.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao vender produto: " + e.getMessage());
        } finally {
            try {
                if (prep != null) prep.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
    
    
        



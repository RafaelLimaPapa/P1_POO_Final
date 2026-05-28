import java.sql.ResultSet;
import java.util.ArrayList;

public class MusicaDAO {

    public static ArrayList<Musica> carregarMusicas() throws Exception {
        String sql = "SELECT titulo FROM tb_musica";
        ArrayList<Musica> musicas = new ArrayList<>();

        System.out.println("Conectando ao banco de dados usando DAO...");

        try (
            var conexao = ConnectionFactory.obterConexao();
            var ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ) {
            while(rs.next()) {
                String titulo = rs.getString("titulo");
                musicas.add(new Musica(titulo));
            }
            System.out.println("Sucesso: " + musicas.size() + " músicas carregadas!");
            return musicas;

        }  
    }
}
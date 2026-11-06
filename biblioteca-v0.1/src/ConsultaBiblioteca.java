import java.util.List;
public interface ConsultaBiblioteca {
     List <Livro> getLivros();
     List <Usuario> getUsuarios();
      double getTotalMultasArrecadadas();
      boolean existeUsuario(int id);
}
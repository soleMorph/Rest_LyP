package Rest.Lycoris.DAO;

import Rest.Lycoris.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarios extends JpaRepository<Usuarios, Long> {

}

package cadastrofornecedores.Repository;

import cadastrofornecedores.Entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}

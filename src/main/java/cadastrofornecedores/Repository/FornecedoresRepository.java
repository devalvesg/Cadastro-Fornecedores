package cadastrofornecedores.Repository;

import cadastrofornecedores.Entities.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<Long, Fornecedores> {
}

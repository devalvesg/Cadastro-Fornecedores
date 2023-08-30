package cadastrofornecedores.Repository;

import cadastrofornecedores.Entities.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FornecedoresRepository extends JpaRepository<Fornecedores, Long> {
}

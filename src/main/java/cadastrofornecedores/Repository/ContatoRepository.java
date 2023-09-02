package cadastrofornecedores.Repository;

import cadastrofornecedores.Entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    @Query(nativeQuery = true, value = """
		DELETE * FROM contato 
		WHERE fornecedor_id = :fornecedor_id
			""")
    void deleteContatos(Long listId);
}

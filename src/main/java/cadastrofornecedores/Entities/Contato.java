package cadastrofornecedores.Entities;

import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Contato {
    private Long id;
    private String name;
    private String email;
    @ManyToOne @JoinColumn(name = "fornecedor_id")
    private Fornecedores fornecedores;
}

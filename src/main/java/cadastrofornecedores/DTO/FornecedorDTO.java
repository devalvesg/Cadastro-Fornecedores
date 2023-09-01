package cadastrofornecedores.DTO;

import cadastrofornecedores.Entities.Contato;
import cadastrofornecedores.Entities.Fornecedores;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class FornecedorDTO {
        private Long id;
        private String razaoSocial;
        private String endereco;
        private List<Contato> contatos;

        public FornecedorDTO(){

        }

    public FornecedorDTO(Fornecedores fornecedores) {
        id = fornecedores.getId();
        razaoSocial = fornecedores.getRazaoSocial();
        endereco = fornecedores.getEndereco();
        contatos = fornecedores.getContatos();
    }

    public String getEndereco() {
        return endereco;
    }

    public Long getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}

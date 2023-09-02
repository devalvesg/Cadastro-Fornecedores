package cadastrofornecedores.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Contato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @ManyToOne @JoinColumn(name = "fornecedor_id") @JsonIgnore
    private Fornecedores fornecedores;

    public Contato(){

    }

    public Contato(String nome, String email, Fornecedores fornecedores) {
        this.nome = nome;
        this.email = email;
        this.fornecedores = fornecedores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}

package cadastrofornecedores.Entities;

import cadastrofornecedores.DTO.FornecedorDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "fornecedores")
public class Fornecedores {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String razaoSocial;

    private String endereco;

    @NotNull
    @OneToMany(mappedBy = "fornecedores")
    private List<Contato> contatos;

    public Fornecedores(){

    }
    public Fornecedores(Long id, String razaoSocial,String endereco, List<Contato> contatos) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.contatos = contatos;
    }

    public Fornecedores(FornecedorDTO fornecedorDTO) {
        this.id = fornecedorDTO.getId();
        this.razaoSocial = fornecedorDTO.getRazaoSocial();
        this.endereco = fornecedorDTO.getEndereco();
        this.contatos = fornecedorDTO.getContatos();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedores that = (Fornecedores) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

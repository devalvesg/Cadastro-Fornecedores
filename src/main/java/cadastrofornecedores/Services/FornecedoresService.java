package cadastrofornecedores.Services;

import cadastrofornecedores.Entities.Contato;
import cadastrofornecedores.Entities.Fornecedores;
import cadastrofornecedores.Repository.ContatoRepository;
import cadastrofornecedores.Repository.FornecedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class FornecedoresService {
    @Autowired
    private FornecedoresRepository fornecedoresRepository;
    @Autowired
    private ContatoRepository contatoRepository;

    public List<Fornecedores> findAll(){
        List<Fornecedores> fornecedores = fornecedoresRepository.findAll();
        return fornecedores;
    }

    public Fornecedores findById(Long id){
        return fornecedoresRepository.findById(id).get();
    }

    public void novoFornecedor(Fornecedores fornecedor) {
        fornecedoresRepository.save(fornecedor);

        for(Contato c : fornecedor.getContatos()){
            Contato contato = new Contato(c.getNome(), c.getEmail(), fornecedor);
            contatoRepository.save(contato);
        }
    }
}

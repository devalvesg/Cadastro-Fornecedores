package cadastrofornecedores.Services;

import cadastrofornecedores.Entities.Fornecedores;
import cadastrofornecedores.Repository.FornecedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class FornecedoresService {
    private FornecedoresRepository fornecedoresRepository;

    public List<Fornecedores> findAll(){
        List<Fornecedores> fornecedores = fornecedoresRepository.findAll();
        return fornecedores;
    }

    public Fornecedores findById(Long id){
        return fornecedoresRepository.findById(id).get();
    }
}

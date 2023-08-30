package cadastrofornecedores.Controllers;

import cadastrofornecedores.Entities.Fornecedores;
import cadastrofornecedores.Services.FornecedoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping(value = "/fornecedores")
public class FornecedoresController {
    private FornecedoresService fornecedoresService;

    @GetMapping
    public ResponseEntity findAll(){
        List<Fornecedores> fornecedores = fornecedoresService.findAll();
        return ResponseEntity.ok(fornecedores);
    }
}

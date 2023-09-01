package cadastrofornecedores.Controllers;

import cadastrofornecedores.DTO.FornecedorDTO;
import cadastrofornecedores.Entities.Contato;
import cadastrofornecedores.Entities.Fornecedores;
import cadastrofornecedores.Services.FornecedoresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController @RequestMapping(value = "/fornecedores")
public class FornecedoresController {
    @Autowired
    private FornecedoresService fornecedoresService;

    @GetMapping
    public ResponseEntity findAll(){
        List<Fornecedores> fornecedores = fornecedoresService.findAll();
        return ResponseEntity.ok(fornecedores);
    }

    @PostMapping
    public ResponseEntity novoFornecedor(@RequestBody @Valid FornecedorDTO fornecedorDTO){
        Fornecedores fornecedor = new Fornecedores(fornecedorDTO);
        fornecedoresService.novoFornecedor(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

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

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Fornecedores fornecedor = fornecedoresService.findById(id);
        return ResponseEntity.ok(fornecedor);
    }

    @PostMapping
    public ResponseEntity novoFornecedor(@RequestBody @Valid FornecedorDTO fornecedorDTO){
        try {
        Fornecedores fornecedor = new Fornecedores(fornecedorDTO);
        fornecedoresService.novoFornecedor(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
        }catch (Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O fornecedor deve ter pelo menos 1(UM) contato");
        }
    }

    public ResponseEntity deletarFornecedor(@RequestBody Long id){
        fornecedoresService.deletarFornecedor(id);
        return ResponseEntity.ok(fornecedoresService.findById(id));
    }
}

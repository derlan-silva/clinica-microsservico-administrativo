package com.clinica.administrativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return repository.save(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }
}
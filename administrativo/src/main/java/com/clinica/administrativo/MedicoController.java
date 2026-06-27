package com.clinica.administrativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public Medico cadastrar(@RequestBody Medico medico) {
        return repository.save(medico);
    }

    @GetMapping
    public List<Medico> listarTodos() {
        return repository.findAll();
    }
}
package com.fatec.fornecedor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.fornecedor.entities.Fornecedor;
import com.fatec.fornecedor.services.FornecedorService;

@RestController
@CrossOrigin
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("fornecedores/{id}")
    public Fornecedor getFornecedor(@PathVariable int id){
        return fornecedorService.getFornecedorById(id);
    }

    @GetMapping("fornecedores")
    public List<Fornecedor> getFornecedores(){
        return fornecedorService.getFornecedores();
    }
}
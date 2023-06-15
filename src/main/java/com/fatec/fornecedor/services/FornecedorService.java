package com.fatec.fornecedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.fornecedor.entities.Fornecedor;
import com.fatec.fornecedor.repositories.FornecedorRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor getFornecedorById(int id){
        return fornecedorRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Fornecedor não encontrado!")
        );
    }

    public List<Fornecedor> getFornecedores(){
        return fornecedorRepository.findAll();
    }
}

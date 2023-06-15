package com.fatec.fornecedor.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.fornecedor.entities.Fornecedor;

@RestController
public class FornecedorController {

    @GetMapping("fornecedor")
    public Fornecedor getFornecedor(){
        Fornecedor f = new Fornecedor(1, "SupplyBrazil", "supplybrazil@gmail.com");
        return f;
    }

    @GetMapping("fornecedores")
    public List<Fornecedor> getFornecedores(){
        List <Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        Fornecedor f1 = new Fornecedor(1, "SupplyBrazil", "comercial@supplybrazil.com");
        Fornecedor f2 = new Fornecedor(2, "SupplyCom", "comercial@supplycom.com");
        fornecedores.add(f1);
        fornecedores.add(f2);
        return fornecedores;
    }
}
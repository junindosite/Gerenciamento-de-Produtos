package com.junior.crud.controller;

import com.junior.crud.entity.Produto;
import com.junior.crud.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return service.salvar(produto);
    }
}
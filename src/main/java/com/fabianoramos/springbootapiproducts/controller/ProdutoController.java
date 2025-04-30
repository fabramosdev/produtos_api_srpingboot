package com.fabianoramos.springbootapiproducts.controller;

import com.fabianoramos.springbootapiproducts.model.Produto;
import com.fabianoramos.springbootapiproducts.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        var uuid = UUID.randomUUID().toString();
        produto.setId(uuid);

        System.out.println("Produto recebido: " + produto);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("{id}")
    public Produto obterProduto(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }
}

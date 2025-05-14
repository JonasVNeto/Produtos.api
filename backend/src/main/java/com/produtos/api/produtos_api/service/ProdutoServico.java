package com.produtos.api.produtos_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.api.produtos_api.modules.ProdutoModelo;
import com.produtos.api.produtos_api.repository.produtorepositorio;

@Service
public class ProdutoServico {
    @Autowired
    private produtorepositorio pr;

    public Iterable<ProdutoModelo> listar() {
        return pr.findAll();
    }
}
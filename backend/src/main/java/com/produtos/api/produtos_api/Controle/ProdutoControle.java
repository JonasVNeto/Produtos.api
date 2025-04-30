package com.produtos.api.produtos_api.Controle;

import org.springframework.web.bind.annotation.GetMapping;

public class ProdutoControle {
    
    @GetMapping("/")
    public String rota() {
        return "A API está funcionando!";
    }

}

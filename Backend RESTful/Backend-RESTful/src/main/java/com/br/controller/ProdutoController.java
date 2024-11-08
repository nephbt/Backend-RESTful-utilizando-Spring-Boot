package com.br.controller;
import com.br.modelo.Produto;
import com.br.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarProdutos();
    }
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return produtoService.salvarProduto(produto);
    }
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        return produtoService.buscarProdutoPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}

package com.br.service;

import com.br.modelo.Cliente;
import com.br.modelo.Produto;
import com.br.repository.ClienteRepository;
import com.br.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }



}

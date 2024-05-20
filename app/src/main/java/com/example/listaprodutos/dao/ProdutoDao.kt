package com.example.listaprodutos.dao

import com.example.listaprodutos.model.Produto

class ProdutoDao {
    fun criarProduto(produto: Produto){
        produtos.add(produto)
    }
    fun mostrarProdutos(): List<Produto>{
        return produtos
    }
    companion object{
        private var produtos: MutableList<Produto> = mutableListOf()
    }
}

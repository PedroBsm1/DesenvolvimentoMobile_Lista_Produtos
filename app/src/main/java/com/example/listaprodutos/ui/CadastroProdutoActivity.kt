package com.example.listaprodutos.ui

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.listaprodutos.R
import com.example.listaprodutos.dao.ProdutoDao
import com.example.listaprodutos.model.Produto

class CadastroProdutoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_produto)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)

        btnSalvar.setOnClickListener{
            val nomeProduto = findViewById<EditText>(R.id.text_nome_produto)
            val valorProduto = findViewById<EditText>(R.id.text_valor_produto)
            val textoNome = nomeProduto.text.toString()
            val textValor = valorProduto.text.toString().toBigDecimal()
            val produto = Produto(textoNome,textValor)
            val dao = ProdutoDao()
            dao.criarProduto(produto)

            Log.i("Salvou", "Saindo..: $produto ")
            finish()
        }
    }
}
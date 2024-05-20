package com.example.listaprodutos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.model.Produto

class ProdutoAdapter(private val produtos: List<Produto>) : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

    class ProdutoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeProduto: TextView = view.findViewById(R.id.nome_produto)
        val precoProduto: TextView = view.findViewById(R.id.preco_produto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_produto, parent, false)
        return ProdutoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = produtos[position]
        holder.nomeProduto.text = produto.nome
        holder.precoProduto.text = produto.preco.toString()
    }

    override fun getItemCount() = produtos.size
}

package com.example.listaprodutos.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.dao.ProdutoDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        fab.setOnClickListener{
            val intent = Intent(this, CadastroProdutoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val dao = ProdutoDao()
        val produtos = dao.mostrarProdutos()
        val adapter = ProdutoAdapter(produtos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}

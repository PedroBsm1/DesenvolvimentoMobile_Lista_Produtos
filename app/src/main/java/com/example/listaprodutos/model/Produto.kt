package com.example.listaprodutos.model

import java.math.BigDecimal

data class Produto (
    var nome:String = "",
    var preco:BigDecimal = BigDecimal.ZERO
)

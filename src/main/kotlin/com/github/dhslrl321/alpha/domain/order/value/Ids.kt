package com.github.dhslrl321.alpha.domain.order.value

import com.github.dhslrl321.alpha.domain.order.ProductItem
import java.util.UUID

data class ProductId(val value: String) {
    companion object {
        fun newId(): ProductId = ProductId(genId())
    }
}

data class ProductItemId(val value: String) {
    companion object {
        fun newId(): ProductItemId = ProductItemId(genId())
    }
}

data class SellerId(val value: String)

fun genId(): String {
    return UUID.randomUUID().toString()
}


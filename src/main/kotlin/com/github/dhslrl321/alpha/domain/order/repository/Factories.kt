package com.github.dhslrl321.alpha.domain.order.repository

import com.github.dhslrl321.alpha.domain.order.Product
import com.github.dhslrl321.alpha.domain.order.ProductItem

interface ProductFactory {
    fun create(): Product
}

interface ProductItemFactory {
    fun create(product: Product): ProductItem
}

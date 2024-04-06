package com.github.dhslrl321.alpha.domain.order.repository

import com.github.dhslrl321.alpha.domain.order.Product
import com.github.dhslrl321.alpha.domain.order.ProductItem
import com.github.dhslrl321.alpha.domain.order.value.ProductId
import com.github.dhslrl321.alpha.domain.order.value.ProductItemId

interface ProductRepository {
    fun findBy(id: ProductId): Product?

    fun save(product: Product)
}

interface ProductItemRepository {
    fun findBy(id: ProductItemId): ProductItem?

    fun save(productItem: ProductItem)
}

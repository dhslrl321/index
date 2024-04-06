package com.github.dhslrl321.alpha.infrastructure

import com.github.dhslrl321.alpha.domain.order.Product
import com.github.dhslrl321.alpha.domain.order.repository.ProductRepository
import com.github.dhslrl321.alpha.domain.order.value.ProductId
import org.springframework.stereotype.Repository

@Repository
class HashMapProductRepository: ProductRepository {
    override fun findBy(id: ProductId): Product? {
        TODO("Not yet implemented")
    }

    override fun save(product: Product) {
        TODO("Not yet implemented")
    }
}

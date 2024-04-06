package com.github.dhslrl321.alpha.application

import com.github.dhslrl321.alpha.domain.order.repository.ProductFactory
import com.github.dhslrl321.alpha.domain.order.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class CreateProductService(
    private val repository: ProductRepository,
    private val productFactory: ProductFactory,
) {
    fun create() {
        val product = productFactory.create()
        repository.save(product);
    }
}

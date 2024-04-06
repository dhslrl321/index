package com.github.dhslrl321.alpha.domain.order

import com.github.dhslrl321.alpha.domain.order.ProductSalesStatus.INSPECTION
import com.github.dhslrl321.alpha.domain.order.value.ProductId

class Product(
    val id: ProductId,
    val status: ProductSalesStatus = INSPECTION,
    val metadata: ProductMetadata,
    val availableOptions: List<ProductOption>,
    val seller: Seller,
    val productItems: List<ProductItem>,
)

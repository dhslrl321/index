package com.github.dhslrl321.alpha.domain.order

import com.github.dhslrl321.alpha.domain.order.value.Price
import com.github.dhslrl321.alpha.domain.order.value.ProductItemId
import com.github.dhslrl321.alpha.domain.order.value.Quantity

class ProductItem(
    val id: ProductItemId,
    val combinations: List<DesignatedOption>,
    val originPrice: Price,
    val salesPrice: Price,
    val quantity: Quantity,
) {
}

package com.github.dhslrl321.alpha.application

import com.github.dhslrl321.alpha.domain.order.*
import com.github.dhslrl321.alpha.domain.order.repository.ProductFactory
import com.github.dhslrl321.alpha.domain.order.value.Price
import com.github.dhslrl321.alpha.domain.order.value.ProductId.Companion.newId
import com.github.dhslrl321.alpha.domain.order.value.ProductItemId
import com.github.dhslrl321.alpha.domain.order.value.Quantity
import com.github.dhslrl321.alpha.domain.order.value.SellerId
import org.springframework.stereotype.Component

@Component
class HardCodedProductFactory : ProductFactory {
    override fun create(): Product {
        return Product(
            id = newId(),
            metadata = ProductMetadata("양말", "좋은 양말입니다", ProductCategory.APPAREL_AND_ACCESSORIES),
            availableOptions = listOf(
                ProductOption("사이즈", listOf("S", "M", "L"), 1),
                ProductOption("컬러", listOf("BLACK", "WHITE", "RED"), 1),
            ),
            seller = Seller(SellerId("1004"), "BRONZE"),
            productItems = listOf(
                ProductItem(
                    id = ProductItemId.newId(),
                    combinations = listOf(DesignatedOption("사이즈", "S"), DesignatedOption("컬러", "BLACK")),
                    originPrice = Price(9900),
                    salesPrice = Price(5000),
                    quantity = Quantity(10)),
                ProductItem(
                    id = ProductItemId.newId(),
                    combinations = listOf(DesignatedOption("사이즈", "S"), DesignatedOption("컬러", "WHITE")),
                    originPrice = Price(9900),
                    salesPrice = Price(5000),
                    quantity = Quantity(10)),
                ProductItem(
                    id = ProductItemId.newId(),
                    combinations = listOf(DesignatedOption("사이즈", "M"), DesignatedOption("컬러", "BLACK")),
                    originPrice = Price(9900),
                    salesPrice = Price(5000),
                    quantity = Quantity(10)),
                ProductItem(
                    id = ProductItemId.newId(),
                    combinations = listOf(DesignatedOption("사이즈", "L"), DesignatedOption("컬러", "BLACK")),
                    originPrice = Price(9900),
                    salesPrice = Price(5000),
                    quantity = Quantity(10)),
            )
        )
    }
}

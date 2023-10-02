package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.dependency.SubscribeProductItem
import com.github.dhslrl321.alpha.subscription.dependency.UserId
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Create_SubscriptionTest : StringSpec({

    val factory = SubscriptionFactory()

    "구독을 생성할 수 있다" {
        val actual = factory.create(CreateSubscriptionCommand(SubscriptionId("1"), UserId("b")))

        actual.id shouldBe SubscriptionId("1")
        actual.status shouldBe SubscriptionStatus.CREATED
    }

    "처음 구독을 생성하면 1회차 reservedBill 에 대해서 결제가 필요하다" {
        val actual = factory.create(CreateSubscriptionCommand(SubscriptionId("1"), UserId("b")))

        actual.needCompleteFirstBill() shouldBe true
    }
})


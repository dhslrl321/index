package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.SubscribeCommand
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Subscribe_SubscriptionTest : StringSpec({

    "첫 결제가 되었다면 구독이 된다" {
        val sut = SubscriptionFixtures.createdSubscription("1", "b")

        sut.subscribe(SubscribeCommand(Amount(9900), Receipt()))

        sut.needCompleteFirstBill() shouldBe false
        sut.status shouldBe SubscriptionStatus.SUBSCRIBED
        sut.confirmedBills.size shouldBe 1
    }

    "구독에 성공하면 다음 청구가 예약된다" {
        val sut = SubscriptionFixtures.createdSubscription("1", "b")

        sut.subscribe(SubscribeCommand(Amount(9900), Receipt()))

        sut.reservedBill.bill shouldBe Bill(2, Amount(9900))
    }
})

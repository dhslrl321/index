package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.service.BillingCycleCalculator
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDateTime

class Create_SubscriptionTest : StringSpec({

    val factory = SubscriptionFactory(BillingCycleCalculator())

    "구독을 생성할 수 있다" {
        val command = CreateSubscriptionCommand(
            SubscriptionId("1"),
            UserId("b"),
            Receipt(Amount(9900), LocalDateTime.now()),
            Amount(9900),
            BillingCycle(1, BillingCycleUnit.MONTH),
        )

        val actual = factory.create(command)

        actual.id shouldBe SubscriptionId("1")
        actual.status shouldBe SubscriptionStatus.SUBSCRIBED
    }

    "처음 구독을 생성하면 1회차 청구는 항상 완료된어야 한다" {
        val receipt = Receipt(Amount(9900), LocalDateTime.now())

        val command = CreateSubscriptionCommand(
            subscriptionId = SubscriptionId("1"),
            userId = UserId("b"),
            firstBillReceipt = receipt,
            billingAmount = Amount(9900),
            billingCycle = BillingCycle(1, BillingCycleUnit.MONTH),
        )

        val actual = factory.create(command)

        actual.confirmedBills.size shouldBe 1
        actual.getLatestConfirmedBill() shouldBe ConfirmedBill(Bill(1, Amount(9900)), receipt)
    }

    "처음 구독을 생성하면 2회차 청구는 예약되어있다" {
        val receipt = Receipt(Amount(9900), LocalDateTime.now())

        val command = CreateSubscriptionCommand(
            subscriptionId = SubscriptionId("1"),
            userId = UserId("b"),
            firstBillReceipt = receipt,
            billingAmount = Amount(9900),
            billingCycle = BillingCycle(1, BillingCycleUnit.MONTH),
        )

        val actual = factory.create(command)

        actual.reservedBill.bill shouldBe Bill(nth = 2, Amount(9900))
    }
})


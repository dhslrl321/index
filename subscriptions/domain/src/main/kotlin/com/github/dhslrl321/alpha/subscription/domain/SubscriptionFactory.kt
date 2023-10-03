package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.service.BillingCycleCalculator

class SubscriptionFactory(
    private val billingCycleCalculator: BillingCycleCalculator
) {
    fun create(command: CreateSubscriptionCommand): Subscription {

        val receipt = command.firstBillReceipt

        val firstConfirmedBill = ConfirmedBill(Bill(1, receipt.paidAmount), receipt)

        return Subscription(
            id = command.subscriptionId,
            userId = command.userId,
            billingCycle = command.billingCycle,
            reservedBill = ReservedBill(Bill(2, command.billingAmount), billingCycleCalculator.calc(command.billingCycle)),
            confirmedBills = mutableListOf(firstConfirmedBill),
        )
    }
}

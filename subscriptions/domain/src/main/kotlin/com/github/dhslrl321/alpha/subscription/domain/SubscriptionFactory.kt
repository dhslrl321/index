package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import java.time.LocalDateTime

class SubscriptionFactory {
  fun create(command: CreateSubscriptionCommand): Subscription {

    val immediateReservedAt = LocalDateTime.of(1970, 1, 1, 1, 1, 1)

    return Subscription(
      id = command.subscriptionId,
      userId = command.userId,
      reservedBill = ReservedBill(Bill(1, Amount(9900)), immediateReservedAt),
      confirmedBills = mutableListOf(),
    )
  }
}

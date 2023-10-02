package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.SubscribeCommand
import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionStatus.CREATED
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionStatus.SUBSCRIBED

class Subscription(
    val id: SubscriptionId,
    val userId: UserId,

    var status: SubscriptionStatus = CREATED,

    var reservedBill: ReservedBill, // 예약된 청구
    val confirmedBills: MutableList<ConfirmedBill>, // 완료된 청구
) {

    fun needCompleteFirstBill(): Boolean {
        return confirmedBills.isEmpty() && reservedBill.isFirstNth()
    }

    fun subscribe(command: SubscribeCommand) {
        this.reservedBill = reservedBill.reserveNext(command.reservedAmount)
        this.confirmedBills += reservedBill.confirm(command.receipt)

        this.status = SUBSCRIBED

        check(needCompleteFirstBill().not())
    }
}

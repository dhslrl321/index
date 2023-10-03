package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionStatus.SUBSCRIBED

class Subscription(
    val id: SubscriptionId,
    val userId: UserId,

    var status: SubscriptionStatus = SUBSCRIBED,
    var billingCycle: BillingCycle,

    var reservedBill: ReservedBill, // 예약된 청구
    val confirmedBills: MutableList<ConfirmedBill> = mutableListOf(), // 완료된 청구
) {

    // TODO subscription 생성 방법을 하나로 통일할 수 없을까
    // TODO 문제가 지금 factory 에 의해서 생성된 구독의 invariant 를 모른다
    fun getLatestConfirmedBill(): ConfirmedBill = this.confirmedBills.last()
}

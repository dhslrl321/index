package com.github.dhslrl321.alpha.subscription.domain

import java.time.LocalDateTime

class ReservedBill(
  val bill: Bill,
  val reservedAt: LocalDateTime
) {
  fun reserveNext(amount: Amount): ReservedBill {
    return ReservedBill(
      Bill(bill.nth + 1, amount),
      reservedAt.plusMonths(1)
    )
  }

    fun isFirstNth(): Boolean {
        return this.bill.nth == 1
    }

    fun confirm(receipt: Receipt): ConfirmedBill {
        return ConfirmedBill(this.bill, receipt)
    }
}

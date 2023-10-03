package com.github.dhslrl321.alpha.subscription.domain

import java.time.LocalDateTime

data class ConfirmedBill(
    val bill: Bill,
    val receipt: Receipt,
) {

}

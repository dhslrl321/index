package com.github.dhslrl321.alpha.subscription.domain

import java.time.LocalDateTime

data class Receipt(
    val paidAmount: Amount,
    val paidAt: LocalDateTime,
)

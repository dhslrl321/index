package com.github.dhslrl321.alpha.subscription.command

import com.github.dhslrl321.alpha.subscription.domain.Amount
import com.github.dhslrl321.alpha.subscription.domain.Receipt

data class SubscribeCommand(
    val reservedAmount: Amount,
    val receipt: Receipt
)

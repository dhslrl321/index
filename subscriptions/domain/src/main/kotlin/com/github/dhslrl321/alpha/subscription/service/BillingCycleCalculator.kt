package com.github.dhslrl321.alpha.subscription.service

import com.github.dhslrl321.alpha.subscription.domain.BillingCycle
import com.github.dhslrl321.alpha.subscription.domain.BillingCycleUnit
import java.time.LocalDateTime

class BillingCycleCalculator {
    fun calc(cycle: BillingCycle): LocalDateTime = when(cycle.unit) {
        BillingCycleUnit.MONTH -> LocalDateTime.now().plusMonths(1)
        BillingCycleUnit.WEEK -> LocalDateTime.now().plusWeeks(1)
        BillingCycleUnit.DAY -> TODO()
    }
}

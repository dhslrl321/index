package com.github.dhslrl321.alpha.subscription.service

import com.github.dhslrl321.alpha.subscription.domain.BillingCycle
import com.github.dhslrl321.alpha.subscription.domain.BillingCycleUnit
import com.github.dhslrl321.alpha.subscription.domain.BillingCycleUnit.WEEK
import io.kotest.core.spec.style.StringSpec

class BillingCycleCalculatorTest: StringSpec({
    "다음 결제일은 결제 주기에 의해 결정된다" {
        val sut = BillingCycleCalculator()

        val calc = sut.calc(BillingCycle(1, WEEK))
    }
})

package com.github.dhslrl321.alpha.subscription.domain

import io.kotest.core.spec.style.StringSpec
import java.time.Instant
import java.time.LocalDateTime

class ReservedBillTest: StringSpec({
    "청구를 새롭게 생성할 수 있다" {
        val sut = ReservedBill(Bill(1, Amount(9900)), LocalDateTime.now())

        val next: ReservedBill = sut.reserveNext(Amount(9900))
    }

})

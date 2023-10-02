package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.*
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
class SubscriptionRepositoryProxy(
    private val repository: SubscriptionRepositoryDataJpaImpl
) : SubscriptionRepository {

    override fun findBy(id: SubscriptionId): Subscription? {
        val entity = repository.findById(id.value)
            .orElse(null) ?: return null

        val reservedBill = ReservedBill(Bill(1, Amount(1)), LocalDateTime.now())
        return Subscription(id, UserId("va"), status = SubscriptionStatus.CREATED, reservedBill = reservedBill, )
    }

    override fun save(domain: Subscription) {
        TODO("Not yet implemented")
    }

}

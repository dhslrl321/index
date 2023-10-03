package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.*
import com.github.dhslrl321.alpha.subscriptions.entity.SubscriptionEntity
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
class SubscriptionRepositoryProxy(
    private val repository: SubscriptionRepositoryMutableMapImpl
) : SubscriptionRepository {

    override fun findBy(id: SubscriptionId): Subscription? {
        return repository.findBy(id)
    }

    @Transactional
    override fun save(domain: Subscription) {
        repository.save(domain)
    }

}

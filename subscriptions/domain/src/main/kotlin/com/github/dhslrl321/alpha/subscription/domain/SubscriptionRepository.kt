package com.github.dhslrl321.alpha.subscription.domain

interface SubscriptionRepository {

    fun findBy(id: SubscriptionId): Subscription?

    fun save(domain: Subscription)

}

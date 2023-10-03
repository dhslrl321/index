package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscription.domain.Subscription
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionId
import org.springframework.stereotype.Repository

@Repository
class SubscriptionRepositoryMutableMapImpl(val map: MutableMap<String, Subscription>) {

    fun save(entity: Subscription) {
        map[entity.id.value] = entity
    }

    fun findBy(id: SubscriptionId): Subscription? {
        if (map.containsKey(id.value).not()) {
            return null
        }
        return map[id.value]
    }
}

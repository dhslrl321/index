package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscriptions.entity.SubscriptionEntity
import org.springframework.data.repository.CrudRepository

interface SubscriptionRepositoryDataJpaImpl : CrudRepository<SubscriptionEntity, String> {
}

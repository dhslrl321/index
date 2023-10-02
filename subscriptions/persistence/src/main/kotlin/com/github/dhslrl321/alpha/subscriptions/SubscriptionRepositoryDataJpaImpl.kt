package com.github.dhslrl321.alpha.subscriptions

import org.springframework.data.repository.CrudRepository

interface SubscriptionRepositoryDataJpaImpl : CrudRepository<SubscriptionEntity, String> {
}

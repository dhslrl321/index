package com.github.dhslrl321.alpha.subscriptions

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity(name = "subscriptions")
data class SubscriptionEntity(
    @Id var id: String,
    var name: String
)

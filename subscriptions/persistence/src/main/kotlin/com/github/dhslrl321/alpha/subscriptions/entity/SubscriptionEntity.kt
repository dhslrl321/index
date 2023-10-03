package com.github.dhslrl321.alpha.subscriptions.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity(name = "subscriptions")
data class SubscriptionEntity(
    @Id val id: String,
    val userId: String,
    val name: String,
    val status: String,
)

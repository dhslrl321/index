package com.github.dhslrl321.alpha.subscription.command

import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionId

data class CreateSubscriptionCommand(
    val subscriptionId: SubscriptionId,
    val userId: UserId,
)

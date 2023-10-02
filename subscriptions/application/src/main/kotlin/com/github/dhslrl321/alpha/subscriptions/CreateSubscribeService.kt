package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscription.domain.SubscriptionRepository
import org.springframework.stereotype.Service

@Service
class CreateSubscribeService(
    private val repository: SubscriptionRepository
) {
}

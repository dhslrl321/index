package com.github.dhslrl321.alpha.subscription.domain

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.dependency.UserId

object SubscriptionFixtures {

    private val factory: SubscriptionFactory = SubscriptionFactory()

    fun createdSubscription(sId: String, uId: String): Subscription =
        factory.create(CreateSubscriptionCommand(SubscriptionId(sId), UserId(uId)))
}

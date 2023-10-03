package com.github.dhslrl321.alpha

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.dependency.UserId
import com.github.dhslrl321.alpha.subscription.domain.*
import com.github.dhslrl321.alpha.subscription.service.BillingCycleCalculator

object SubscriptionFixtures {

    private val factory: SubscriptionFactory = SubscriptionFactory(BillingCycleCalculator())

    fun createdSubscription(sId: String, uId: String): Subscription {

        TODO()
        /*val command = CreateSubscriptionCommand(
            subscriptionId = SubscriptionId(sId),
            userId = UserId(uId),
            billingAmount = Amount(9900))

        return factory.create(command)*/
    }
}

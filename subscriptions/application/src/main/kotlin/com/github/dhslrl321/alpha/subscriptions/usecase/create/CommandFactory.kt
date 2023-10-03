package com.github.dhslrl321.alpha.subscriptions.usecase.create

import com.github.dhslrl321.alpha.subscription.command.CreateSubscriptionCommand
import com.github.dhslrl321.alpha.subscription.command.SubscribeCommand
import com.github.dhslrl321.alpha.subscriptions.data.CreateSubscriptionRequest
import org.springframework.stereotype.Component

@Component
class CommandFactory {
    fun createCreated(request: CreateSubscriptionRequest): CreateSubscriptionCommand {
        TODO("Not yet implemented")
    }

    fun createSubscribed(request: CreateSubscriptionRequest): SubscribeCommand {
        TODO("Not yet implemented")
    }
}

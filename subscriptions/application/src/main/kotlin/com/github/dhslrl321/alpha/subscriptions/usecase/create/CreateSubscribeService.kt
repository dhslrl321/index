package com.github.dhslrl321.alpha.subscriptions.usecase.create

import com.github.dhslrl321.alpha.subscription.domain.SubscriptionFactory
import com.github.dhslrl321.alpha.subscription.domain.SubscriptionRepository
import com.github.dhslrl321.alpha.subscriptions.data.CreateSubscriptionRequest
import org.springframework.stereotype.Service

@Service
class CreateSubscribeService(
    private val repository: SubscriptionRepository,
    private val validator: SubscribeValidator,

    private val commandFactory: CommandFactory,
    private val domainFactory: SubscriptionFactory,
) {
    fun create(request: CreateSubscriptionRequest) {

        validator.validate(request)
        val command = commandFactory.createCreated(request)
        val subscription = domainFactory.create(command)

        // TODO 1회차 결제를 성공시켜야함

        repository.save(subscription)
    }
}

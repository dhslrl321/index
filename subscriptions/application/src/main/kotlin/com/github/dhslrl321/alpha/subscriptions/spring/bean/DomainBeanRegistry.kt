package com.github.dhslrl321.alpha.subscriptions.spring.bean

import com.github.dhslrl321.alpha.subscription.domain.SubscriptionFactory
import com.github.dhslrl321.alpha.subscription.service.BillingCycleCalculator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DomainBeanRegistry {
    @Bean
    fun subscriptionFactory() = SubscriptionFactory(BillingCycleCalculator())
}

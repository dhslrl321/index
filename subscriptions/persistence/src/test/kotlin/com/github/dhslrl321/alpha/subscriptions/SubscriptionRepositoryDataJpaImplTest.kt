package com.github.dhslrl321.alpha.subscriptions

import com.github.dhslrl321.alpha.subscription.domain.SubscriptionId
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.jdbc.Sql

@Sql("classpath:init.sql")
@ActiveProfiles("test")
@SpringBootTest(classes = [TestContext::class])
class SubscriptionRepositoryDataJpaImplTest {

    @Autowired
    lateinit var sut: SubscriptionRepositoryProxy

    @Test
    fun name() {
        sut.findBy(SubscriptionId("9"))
    }
}

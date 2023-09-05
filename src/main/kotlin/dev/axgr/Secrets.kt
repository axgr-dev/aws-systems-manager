package dev.axgr

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@RefreshScope
@Configuration
class SecretHolder {

  @Value("\${secret}")
  private lateinit var secret: String

  fun secret() = secret

}

@Component
class SecretReader(private val holder: SecretHolder) {

  @Scheduled(fixedDelay = 1000)
  fun print() = println(holder.secret())

}

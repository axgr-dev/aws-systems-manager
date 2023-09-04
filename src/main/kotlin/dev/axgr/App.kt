package dev.axgr

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class AwsSystemsManagerApplication {

  @Bean
  fun run(@Value("\${secret}") secret: String) = CommandLineRunner {
    println(secret)
  }
}

fun main(args: Array<String>) {
  runApplication<AwsSystemsManagerApplication>(*args)
}

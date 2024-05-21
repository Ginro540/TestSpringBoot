package com.example.TestSpringBoot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestSpringBootApplication

fun main(args: Array<String>) {
	runApplication<TestSpringBootApplication>(*args)
}

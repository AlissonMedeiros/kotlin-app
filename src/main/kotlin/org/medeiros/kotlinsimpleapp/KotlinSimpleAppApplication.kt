package org.medeiros.kotlinsimpleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSimpleAppApplication

fun main(args: Array<String>) {
	runApplication<KotlinSimpleAppApplication>(*args)
}

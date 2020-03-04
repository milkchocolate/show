package org.mad.show

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShowApplication

fun main(args: Array<String>) {
	runApplication<ShowApplication>(*args)
}

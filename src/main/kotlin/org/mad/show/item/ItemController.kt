package org.mad.show.item

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("items")
class ItemController {
    @GetMapping
    fun getItems(@RequestParam names: String,
                 @RequestParam delay: Int,
                 @RequestParam statusCode: Int): ResponseEntity<List<Pair<String, String>>> {
        if (delay > 0) {
            Thread.sleep(delay * 1000L)
        }
        val results = names.split(",")
                .map { Pair(it, System.getenv(it)) }
        return ResponseEntity(results, HttpStatus.valueOf(statusCode))
    }
}
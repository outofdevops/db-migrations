package com.outofdevops.analytics

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.lang.String
import java.net.URI

@RestController
class ReSTController(val service: EventService) {

    @GetMapping("/events")
    fun index(): List<Event> = service.findEvents()

    @PostMapping("/events")
    fun post(@RequestBody event: Event): ResponseEntity<Event> {
        println(event)

        val location: URI = URI.create(String.format("/events/%s", service.post(event).id))

        return ResponseEntity.created(location).build()
    }
}
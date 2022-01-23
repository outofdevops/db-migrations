package com.outofdevops.analytics

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.net.URI
import java.util.*




@RestController
class ReSTController(val service: EventService) {

    @PostMapping("/v1.0/events")
    fun post(@RequestBody event: Event): ResponseEntity<Event> {
        val location: URI = URI.create(String.format("/v1.0/events/%s", service.post(event).id))

        return ResponseEntity.created(location).build()
    }

    @GetMapping("/v1.0/events")
    fun index(): MutableIterable<Event> = service.allEvents()

    @GetMapping("/v1.0/events/{id}")
    fun get(@PathVariable id: String): Optional<Event> {
        try {
            UUID.fromString(id)
        } catch (ex: IllegalArgumentException ) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Event ID Not Found", ex)
        }

        return service.findEvent(id)
    }


}
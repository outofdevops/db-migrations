package com.outofdevops.analytics

import org.springframework.stereotype.Service
import java.util.*

@Service
class EventService(val db: EventRepository) {

    fun allEvents(): MutableIterable<Event> = db.findAll()

    fun findEvent(id: String): Optional<Event> = db.findById(id)

    fun create(event: Event): Event {
        return db.save(event)
    }
}
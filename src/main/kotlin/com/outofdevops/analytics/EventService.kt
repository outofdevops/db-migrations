package com.outofdevops.analytics

import org.springframework.stereotype.Service

@Service
class EventService(val db: EventRepository) {

    fun findEvents(): List<Event> = db.findEvents()



    fun post(event: Event): Event {
        return db.save(event)
    }
}
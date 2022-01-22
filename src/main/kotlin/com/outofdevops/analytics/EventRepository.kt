package com.outofdevops.analytics

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface EventRepository : CrudRepository<Event, String>{

    @Query("select * from event")
    fun findEvents(): List<Event>
}
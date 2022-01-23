package com.outofdevops.analytics

import org.springframework.data.repository.CrudRepository

interface EventRepository : CrudRepository<Event, String>{}
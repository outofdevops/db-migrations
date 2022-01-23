package com.outofdevops.analytics

import org.springframework.data.annotation.Id
import java.util.*

data class Event(
        @Id
        val id: UUID?,
        val name: String
)

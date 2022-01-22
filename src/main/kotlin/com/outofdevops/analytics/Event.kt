package com.outofdevops.analytics

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("event")
@TypeAlias("event")
data class Event(
        @Id
        val id: UUID?,
        val name: String
)

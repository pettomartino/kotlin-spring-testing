package com.example.demo.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name="users")
open class User(
    @Id @GeneratedValue
    val id: Long? = null,
    val email: String? = null,
    val admin: Boolean? = null,
    var created_at: Date? = null,
    var updated_at: Date? = null,
    var confirmed_at: Date? = null,
    var active: Boolean? = null
)

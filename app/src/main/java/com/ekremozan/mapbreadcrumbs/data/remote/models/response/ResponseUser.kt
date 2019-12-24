package com.ekremozan.mapbreadcrumbs.data.remote.models.response

data class ResponseUser(
    val id: Number,
    val userName: String,
    val userRoleId: Number,
    val userRole: String,
    val ip: String
)
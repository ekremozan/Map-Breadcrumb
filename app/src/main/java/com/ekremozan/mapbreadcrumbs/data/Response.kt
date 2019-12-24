package com.ekremozan.mapbreadcrumbs.data

data class Response<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T?): Response<T> {
            return Response(Status.SUCCESS, data, null)
        }

        fun <T> error(message: String): Response<T> {
            return Response(Status.ERROR, null, message)
        }
    }
}
package com.ekremozan.mapbreadcrumbs.data.remote

import com.ekremozan.mapbreadcrumbs.data.remote.models.request.Login
import com.ekremozan.mapbreadcrumbs.data.remote.models.response.Token
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("Authenticate")
    fun authenticate(@Body login: Login): Single<Token>

}
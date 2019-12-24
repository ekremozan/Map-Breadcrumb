package com.ekremozan.mapbreadcrumbs.data.remote.datasources

import com.ekremozan.mapbreadcrumbs.data.Response
import com.ekremozan.mapbreadcrumbs.data.remote.RetrofitServiceProvider
import com.ekremozan.mapbreadcrumbs.data.remote.models.request.Login
import com.ekremozan.mapbreadcrumbs.data.remote.models.response.Token
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

    class UserDataSource @Inject constructor(private val retrofitServiceProvider: RetrofitServiceProvider) {

    fun authenticate(login: Login): Observable<Response<Token>> {
        return Observable.create { emitter ->
            retrofitServiceProvider
                .getApiService()
                .authenticate(login)
                .subscribeOn(Schedulers.io())
                .subscribe(
                    { token ->
                        emitter.onNext(Response.success(token))
                        emitter.onComplete()
                    },
                    { error ->
                        emitter.onNext(Response.error(error.message ?: ""))
                        emitter.onComplete()
                    })
        }
    }
}
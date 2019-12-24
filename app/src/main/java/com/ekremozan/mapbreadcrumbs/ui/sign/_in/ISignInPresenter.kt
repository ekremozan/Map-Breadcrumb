package com.ekremozan.mapbreadcrumbs.ui.sign._in

import com.ekremozan.mapbreadcrumbs.data.remote.models.request.Login
import com.ekremozan.mapbreadcrumbs.data.remote.models.response.Token
import com.ekremozan.mapbreadcrumbs.ui.base.IPresenter
import retrofit2.Response

interface ISignInPresenter<V : ISignInView> : IPresenter<V> {

    fun signIn(login: Login)
}
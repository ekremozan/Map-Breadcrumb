package com.ekremozan.mapbreadcrumbs.ui.sign._in

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Context
import android.util.Log
import com.ekremozan.mapbreadcrumbs.data.Status
import com.ekremozan.mapbreadcrumbs.data.local.dao.CoordinateDao
import com.ekremozan.mapbreadcrumbs.data.remote.datasources.UserDataSource
import com.ekremozan.mapbreadcrumbs.data.remote.models.request.Login
import com.ekremozan.mapbreadcrumbs.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import kotlin.math.log

class SignInPresenter<V : ISignInView>
@Inject
constructor(compositeDisposable: CompositeDisposable) : BasePresenter<V>(compositeDisposable),
    ISignInPresenter<V> {

    @Inject
    lateinit var context: Context
    @Inject
    lateinit var userDataSource: UserDataSource
    @Inject
    lateinit var coordinateDao: CoordinateDao

    override fun onAttach(view: V) {
        super.onAttach(view)
    }

    @SuppressLint("CheckResult")
    override fun signIn(login: Login) {

        coordinateDao
            .getAllCoordinates()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe (
                { res -> Log.v("count", res.count().toString()) },
                { res -> Log.v("hata", res.toString()) }
            )

        userDataSource
            .authenticate(login)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { loginResult ->
                mvpView?.showMessage("Oldu")
            }
    }
}

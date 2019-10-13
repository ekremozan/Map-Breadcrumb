package com.ekremozan.mapbreadcrumbs.ui.sign.up

import android.content.Context
import com.ekremozan.mapbreadcrumbs.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignUpPresenter<V: ISignUpView>

@Inject
constructor(compositeDisposable: CompositeDisposable) : BasePresenter<V>(compositeDisposable), ISignUpPresenter<V> {

    @Inject
    lateinit var context: Context

    override fun onAttach(mvpView: V) {
        super.onAttach(mvpView)

    }

}
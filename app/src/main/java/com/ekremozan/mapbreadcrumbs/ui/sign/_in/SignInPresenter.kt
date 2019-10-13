package com.ekremozan.mapbreadcrumbs.ui.sign._in

import android.content.Context
import com.ekremozan.mapbreadcrumbs.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignInPresenter<V : ISignInView>
@Inject
constructor(compositeDisposable: CompositeDisposable) : BasePresenter<V>(compositeDisposable),
    ISignInPresenter<V> {

    @Inject
    lateinit var context: Context

    override fun onAttach(view: V) {
        super.onAttach(view)
    }

}
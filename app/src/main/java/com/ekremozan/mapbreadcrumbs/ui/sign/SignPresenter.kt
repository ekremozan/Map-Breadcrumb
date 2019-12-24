package com.ekremozan.mapbreadcrumbs.ui.sign

import android.content.Context
import com.ekremozan.mapbreadcrumbs.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignPresenter<V: ISignView>
@Inject
constructor(compositeDisposable: CompositeDisposable) : BasePresenter<V>(compositeDisposable), ISignPresenter<V> {

    @Inject
    lateinit var context: Context

    override fun onAttach(view: V) {
        super.onAttach(view)
    }

}
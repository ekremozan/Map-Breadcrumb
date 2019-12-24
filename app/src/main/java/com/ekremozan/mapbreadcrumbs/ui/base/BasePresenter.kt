package com.ekremozan.mapbreadcrumbs.ui.base

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


open class BasePresenter<V : IView> @Inject
constructor(
    private val compositeDisposable: CompositeDisposable
) : IPresenter<V> {

    var mvpView: V? = null
        private set

    private val isViewAttached: Boolean
        get() = mvpView != null

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        compositeDisposable.clear()
        mvpView = null
    }

    fun checkViewAttached() {
        if (!isViewAttached) throw MvpViewNotAttachedException()
    }

    class MvpViewNotAttachedException :
        RuntimeException("Please call Presenter.onAttach(MvpView) before" + " requesting data to the Presenter")
}

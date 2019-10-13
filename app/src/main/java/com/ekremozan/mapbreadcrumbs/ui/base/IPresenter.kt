package com.ekremozan.mapbreadcrumbs.ui.base

interface IPresenter<V : IView> {

    fun onAttach(view: V)

    fun onDetach()
}

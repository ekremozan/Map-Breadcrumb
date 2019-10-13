package com.ekremozan.mapbreadcrumbs.ui.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.ekremozan.mapbreadcrumbs.utils.CommonUtils
import dagger.android.DaggerFragment


abstract class BaseFragment: DaggerFragment(), IView {

    var baseActivity: BaseActivity? = null
    private var mProgressDialog: ProgressDialog? = null


    override fun showSnackbar(message: String?) {
        if (baseActivity != null) {
            baseActivity!!.showSnackbar(message)
        }
    }

    override fun showSnackbar(@StringRes resId: Int) {
        if (baseActivity != null) {
            baseActivity!!.showSnackbar(resId)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp(view)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity = context as BaseActivity?
            this.baseActivity = activity
            activity!!.onFragmentAttached()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun showLoading(message: String) {
        hideLoading()
        mProgressDialog = CommonUtils.showLoadingDialog(this.context!!,message)
    }

    override fun hideLoading() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog!!.cancel()
        }
    }

    override fun showMessage(message: String?) {
        if (baseActivity != null) {
            baseActivity!!.showMessage(message)
        }
    }

    override fun showMessage(@StringRes resId: Int) {
        if (baseActivity != null) {
            baseActivity!!.showMessage(resId)
        }
    }

    override fun onDetach() {
        baseActivity = null
        super.onDetach()
    }

    override fun hideKeyboard() {
        if (baseActivity != null) {
            baseActivity!!.hideKeyboard()
        }
    }

    protected abstract fun setUp(view: View)

    interface Callback {

        fun onFragmentAttached()

        fun onFragmentDetached(tag: String)
    }
}
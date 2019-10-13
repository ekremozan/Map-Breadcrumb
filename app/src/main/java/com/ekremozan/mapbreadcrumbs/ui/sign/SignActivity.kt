package com.ekremozan.mapbreadcrumbs.ui.sign

import android.os.Bundle
import com.ekremozan.mapbreadcrumbs.R
import com.ekremozan.mapbreadcrumbs.ui.base.BaseActivity
import javax.inject.Inject


class SignActivity : BaseActivity(), ISignView {

    @Inject
    lateinit var mPresenter: ISignPresenter<ISignView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_layout)
        mPresenter.onAttach(this@SignActivity)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()
    }
}

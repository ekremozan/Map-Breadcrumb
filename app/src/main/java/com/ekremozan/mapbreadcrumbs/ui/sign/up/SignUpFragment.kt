package com.ekremozan.mapbreadcrumbs.ui.sign.up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekremozan.mapbreadcrumbs.R
import com.ekremozan.mapbreadcrumbs.ui.base.BaseFragment
import javax.inject.Inject

class SignUpFragment : BaseFragment(), ISignUpView {

    override fun setUp(view: View) {
    }

    @Inject
    lateinit var mPresenter: ISignUpPresenter<ISignUpView>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        return view
    }


    override fun onDestroyView() {
        mPresenter.onDetach()
        super.onDestroyView()
    }

}

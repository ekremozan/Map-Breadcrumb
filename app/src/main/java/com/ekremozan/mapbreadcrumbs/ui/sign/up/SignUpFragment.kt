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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var mPresenter: ISignUpPresenter<ISignUpView>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_layout, container, false)

        return view
    }


    override fun onDestroyView() {
        mPresenter.onDetach()
        super.onDestroyView()
    }

}
